package US.CPS.WebService.FSS.Interface;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
@WebService
public interface FileServer {
	   String sayHi(@WebParam(name="text")String text);
    
}
