package SpringcoreQue8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Shape3 {

	public void draw() {
		System.out.println("Drawing a circle");
		
	}
	@PostConstruct
	public void myInit() {
		System.out.println("My init method called for Shape");
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("My cleanup method called for Shape");
	}

}
