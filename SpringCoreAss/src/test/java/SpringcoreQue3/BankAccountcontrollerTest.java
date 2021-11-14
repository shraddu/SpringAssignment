package SpringcoreQue3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BankAccountcontrollerTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Object controller = context.getBean("controller");
		
		assertEquals(controller.getClass().getSimpleName(), "BankAccountcontroller");
		
		
		 
//		if (controller.getClass().getSimpleName().equals("Question")) {
//			System.out.println("Success");
//		} else {
//			fail("Not yet implemented");
//		}
		
		 
	}


}
