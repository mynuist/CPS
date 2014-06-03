package US.CPS.WebService.FSS.Client;
import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import US.CPS.WebService.FSS.Interface.FileServer;


public class TestFSS {
	   public static void main(String[] args) {
		   System.out.println("Starting Client");
	    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	    			new String[] {"US/CPS/WebService/FSS/Client/client-beans.xml"}
	    			);
	    	//获取服务类的对象并且处理
	    	
	    	FileServer sayhi = (FileServer) context.getBean("client");
	    	System.out.println(sayhi.sayHi("Tang bo"));
	    	System.exit(0);
 }
}
