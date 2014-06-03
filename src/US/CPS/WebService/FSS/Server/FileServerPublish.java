package US.CPS.WebService.FSS.Server;
import javax.xml.ws.Endpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import US.CPS.WebService.FSS.Implement.FileServerImpl;


public class FileServerPublish {

	public FileServerPublish(){
		System.out.println("Starting Server");
		new ClassPathXmlApplicationContext(new String[] {
				"US/CPS/WebService/FSS/Server/server-beans.xml"
		});
	}
	
	public static void main(String [] args) throws Exception{
		new FileServerPublish();
		System.out.println("Server ready...");
		
		Thread.sleep(5*60*1000);
		System.out.println("Server exiting");
		System.exit(0);
		
	}
	
}
