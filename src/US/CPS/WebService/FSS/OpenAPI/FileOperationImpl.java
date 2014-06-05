package US.CPS.WebService.FSS.OpenAPI;

import java.io.File;

import US.CPS.Objects.File.FileInfo;
import US.CPS.entity.userinfo.Userinfo;

public class FileOperationImpl implements FileOperation{

	@Override
	public int UploadFile(File file, int fileType, Integer fileId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DownLoadFile(Userinfo info, int FileId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int QueryFileInfo(int FileId, FileInfo fileInfo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
