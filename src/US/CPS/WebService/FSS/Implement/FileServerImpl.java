package US.CPS.WebService.FSS.Implement;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.codec.EncoderException;
import org.json.JSONException;

import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.config.Config;
import com.qiniu.api.io.IoApi;
import com.qiniu.api.io.PutExtra;
import com.qiniu.api.io.PutRet;
import com.qiniu.api.rs.PutPolicy;
import com.qiniu.api.rs.URLUtils;

import java.sql.Timestamp;
import com.qiniu.api.rs.GetPolicy;
import US.CPS.WebService.FSS.Interface.FileServer;
import US.CPS.entity.buckets.Buckets;
import US.CPS.entity.document.Documents;
import US.CPS.entity.userinfo.Userinfo;
import US.CPS.BusinessLayer.Services.Impl.BucketsService;
import US.CPS.BusinessLayer.Services.Impl.DocumentsService;

@WebService(endpointInterface="US.CPS.WebService.FSS.Interface.FileServer",serviceName="FileServer")
public class FileServerImpl implements FileServer{

	private static List<Buckets> bucketslist=null;
	private DocumentsService docService=new DocumentsService();
	
	
	private FileServerImpl(){
		BucketsService tembucketService=new BucketsService();
		bucketslist = tembucketService.GetBucketList();
	}
	
	@Override
	public String sayHi(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int UploadFile(@WebParam(name="file")File file, @WebParam(name="fileType")int fileType, @WebParam(name="fileId")Integer fileId) {
		// TODO Auto-generated method stub
		   
		// select a valid (has rest space) bucket 
		    int validSpaceIndex=ChooseValidBucketState();
		// get the AK and SK
		    Config.ACCESS_KEY = bucketslist.get(validSpaceIndex).getAccessKey();
	        Config.SECRET_KEY = bucketslist.get(validSpaceIndex).getSecurityKey();
	        Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
	    // get bucket name
	        String bucketName = bucketslist.get(validSpaceIndex).getBucketName();
	        PutPolicy putPolicy = new PutPolicy(bucketName);
	        
	        String uptoken="";
			try {
				uptoken = putPolicy.token(mac);
			} catch (AuthException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        PutExtra extra = new PutExtra();
	        String key = file.getName();
	        String localFile = file.getPath();
	        PutRet ret = IoApi.putFile(uptoken, key, localFile, extra);
	        
		    if(ret.statusCode==200)//success
		    {
		    	//store in local database
		    	String basicDownLoadUrl =  bucketslist.get(validSpaceIndex).getDomainUrl();
		    	try {
					basicDownLoadUrl = URLUtils.makeBaseUrl(basicDownLoadUrl,  file.getName());
				} catch (EncoderException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		    	Timestamp cutTime = new Timestamp(System.currentTimeMillis()); 
		    	Short zero = 0 ;
		    	Documents doc=new Documents(file.getName(),basicDownLoadUrl,getDocumentType(key),zero,cutTime,cutTime,(Integer) validSpaceIndex);
		    	
		    	docService.RecordUploadEnvent(doc);
		    }
		    else
		    {
		    	//output to log file־
		    }
		
		return ret.getStatusCode();
	}

	@Override
	public String DownLoadFile(@WebParam(name="userinfo")Userinfo userinfo, @WebParam(name="fileId")long fileId) {
		// TODO Auto-generated method stub
		   
		//find bucket and base url
		Documents doc = docService.FindDocumentById(fileId);
		int bucketIndex=doc.getBucketIndex();
		String baseUrl= doc.getDocDownloadUrl();
		
	    // get the AK and SK
	    Config.ACCESS_KEY = bucketslist.get(bucketIndex).getAccessKey();
        Config.SECRET_KEY = bucketslist.get(bucketIndex).getSecurityKey();
        Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
        GetPolicy getPolicy = new GetPolicy();
        try {
			String downloadUrl = getPolicy.makeRequest(doc.getDocDownloadUrl(), mac);
			return downloadUrl;
		} catch (AuthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "download fail";
	}

	@Override
	public int QueryFileInfo(@WebParam(name="fileId")long fileId, @WebParam(name="fileInfo")Documents fileInfo) {
		// TODO Auto-generated method stub
		
		fileInfo=docService.FindDocumentById(fileId);
		return 0;
	}

	
	private int ChooseValidBucketState(){
	       return 0;	
	}
	private String getDocumentType(String filename){
		int i=filename.length()-1;
		for(;i>=0;i--){
			if(filename.charAt(i)=='.')
				break;
		}
		if(i>=0){
			return filename.substring(i+1);
		}
		else
			return "Unknown";
	}
	
}
