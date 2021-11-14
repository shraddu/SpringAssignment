package SpringcoreQue5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
		 
        Employee emp = (Employee) ac.getBean("myemployee");
        System.out.println(emp.toString());
	}

}
