package SpringcoreQue8;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mainshape{

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("shape.xml");
		context.registerShutdownHook();  
		Shape obj=(Shape) context.getBean("shape");
		obj.draw();
		  

	}
 
}