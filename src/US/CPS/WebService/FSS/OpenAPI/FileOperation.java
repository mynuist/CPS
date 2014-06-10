package US.CPS.WebService.FSS.OpenAPI;

import java.io.File;

import US.CPS.entity.document.Documents;
import US.CPS.entity.userinfo.Userinfo;

public interface FileOperation {

	int UploadFile(File file, int fileType , Integer fileId);// 返回200为成功
	String DownLoadFile(Userinfo userinfo,int fileId);// 返回 下载地址
	int QueryFileInfo(int fileId, Documents  fileInfo); // 结果存放在fileInfo。

}
