package US.CPS.WebService.FSS.OpenAPI;

import java.io.File;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import US.CPS.WebService.FSS.Interface.FileServer;
import US.CPS.entity.document.Documents;
import US.CPS.entity.userinfo.Userinfo;

public class FileOperationImpl implements FileOperation{

	
	private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] {"US/CPS/WebService/FSS/OpenAPI/client-beans.xml"}
			);
	
	FileServer fSSWS = (FileServer) context.getBean("client");
	
	@Override
	public int UploadFile(File file, int fileType, Integer fileId) {
		// TODO Auto-generated method stub
		
		
    	//获取服务类的对象并且处理
    	
		fSSWS.UploadFile(file, fileType, fileId);
		
		return 0;
	}

	@Override
	public int DownLoadFile(Userinfo userinfo, int fileId) {
		// TODO Auto-generated method stub
		
		fSSWS.DownLoadFile(userinfo, fileId);
		
		return 0;
	}

	@Override
	public int QueryFileInfo(int fileId, Documents fileInfo) {
		// TODO Auto-generated method stub
		
		fSSWS.QueryFileInfo(fileId, fileInfo);
		return 0;
	}
	
}
