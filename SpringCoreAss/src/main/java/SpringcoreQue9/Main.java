package SpringcoreQue9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("LifeCyclexml.xml");
		context.registerShutdownHook();
		BeanLifeCycle obj =(BeanLifeCycle) context.getBean("BeanLifeCycle");
		obj.show();
		/*
		BeanLifeCycleAnnotation obj2=(BeanLifeCycleAnnotation)context.getBean("BeanLifeCycleAnn");
		System.out.println(obj2);
		*/
	}

}
