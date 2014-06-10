package US.CPS.WebService.FSS.OpenAPI;

import java.io.File;

import US.CPS.entity.document.Documents;
import US.CPS.entity.userinfo.Userinfo;

public interface FileOperation {

	int UploadFile(File file, int fileType , Integer fileId);// 1 doc; 2 pdf; 暂时两种 ,返回0为正确，其他为错误代码
	int DownLoadFile(Userinfo userinfo,int fileId);//返回0为正确，其他为错误代码
	int QueryFileInfo(int fileId, Documents  fileInfo); // 返回0为正确，其他为错误代码,

}
