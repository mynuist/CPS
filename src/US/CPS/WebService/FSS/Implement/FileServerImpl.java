package US.CPS.WebService.FSS.Implement;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface="US.CPS.WebService.FSS.Interface.FileServer",serviceName="FileServer")
public class FileServerImpl {

	 public String sayHi(String text) {
         return "Hello " + text;
     }
	
}
