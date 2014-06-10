package US.CPS.WebService.FSS.OpenAPI;

import java.io.File;

import US.CPS.entity.document.Documents;
import US.CPS.entity.userinfo.Userinfo;

public interface FileOperation {

	int UploadFile(File file, int fileType , Integer fileId);// 1 doc; 2 pdf; ��ʱ���� ,����0Ϊ��ȷ������Ϊ�������
	int DownLoadFile(Userinfo userinfo,int fileId);//����0Ϊ��ȷ������Ϊ�������
	int QueryFileInfo(int fileId, Documents  fileInfo); // ����0Ϊ��ȷ������Ϊ�������,

}
