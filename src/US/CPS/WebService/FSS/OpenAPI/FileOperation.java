package US.CPS.WebService.FSS.OpenAPI;

import java.io.File;

import US.CPS.Objects.File.FileInfo;
import US.CPS.entity.userinfo.Userinfo;

public interface FileOperation {

	int UploadFile(File file, int fileType , Integer fileId);// 1 doc; 2 pdf; ��ʱ���� ,����0Ϊ��ȷ������Ϊ�������
	int DownLoadFile(Userinfo info,int FileId);//����0Ϊ��ȷ������Ϊ�������
	int QueryFileInfo(int FileId,FileInfo  fileInfo); // ����0Ϊ��ȷ������Ϊ�������,

}
