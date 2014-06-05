package US.CPS.WebService.FSS.Implement;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import US.CPS.Objects.File.FileInfo;
import US.CPS.WebService.FSS.Interface.FileServer;
import US.CPS.entity.userinfo.Userinfo;

@WebService(endpointInterface="US.CPS.WebService.FSS.Interface.FileServer",serviceName="FileServer")
public class FileServerImpl implements FileServer{

	@Override
	public String sayHi(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int UploadFile(@WebParam(name="file")File file, @WebParam(name="fileType")int fileType, @WebParam(name="fileId")Integer fileId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DownLoadFile(@WebParam(name="userinfo")Userinfo userinfo, @WebParam(name="fileId")int fileId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int QueryFileInfo(@WebParam(name="fileId")int fileId, @WebParam(name="fileInfo")FileInfo fileInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
