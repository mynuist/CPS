package US.CPS.WebService.FSS.Interface;
import java.io.File;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import US.CPS.Objects.File.FileInfo;
import US.CPS.entity.userinfo.Userinfo;
@WebService
public interface FileServer {
	   String sayHi(@WebParam(name="text")String text);
    
	   int UploadFile(@WebParam(name="file")File file, @WebParam(name="fileType")int fileType , @WebParam(name="fileId")Integer fileId);// 1 doc; 2 pdf; 暂时两种 ,返回0为正确，其他为错误代码
	   int DownLoadFile(@WebParam(name="userinfo")Userinfo userinfo,@WebParam(name="fileId")int fileId);//返回0为正确，其他为错误代码
	   int QueryFileInfo(@WebParam(name="fileId")int fileId,@WebParam(name="fileInfo")FileInfo  fileInfo); // 返回0为正确，其他为错误代码,
	   
}
