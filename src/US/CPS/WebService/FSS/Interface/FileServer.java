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
    
	   int UploadFile(@WebParam(name="file")File file, @WebParam(name="fileType")int fileType , @WebParam(name="fileId")Integer fileId);// 1 doc; 2 pdf; ��ʱ���� ,����0Ϊ��ȷ������Ϊ�������
	   int DownLoadFile(@WebParam(name="userinfo")Userinfo userinfo,@WebParam(name="fileId")int fileId);//����0Ϊ��ȷ������Ϊ�������
	   int QueryFileInfo(@WebParam(name="fileId")int fileId,@WebParam(name="fileInfo")FileInfo  fileInfo); // ����0Ϊ��ȷ������Ϊ�������,
	   
}
