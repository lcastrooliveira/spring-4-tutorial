package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;

//@Controller
public class GreetingController {

	private HelloWorldService helloWorldService;
	
	private HelloWorldService helloWorldServicePortuguese;
	
	private HelloWorldService helloWorldServiceFrench;
	
	//This autowires by type
	//@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	//This autowires by name - @Qualifier changes bean injection policy
	//@Autowired
	//@Qualifier("helloWorldServicePortuguese") //same name of method in line 38 file HelloConfig.java
	public void setHelloWorldServicePortuguese(HelloWorldService helloWorldServicePortuguese) {
		this.helloWorldServicePortuguese = helloWorldServicePortuguese;
	}
	
	//@Autowired
	//@Qualifier("french") //same name of method in line x file HelloConfig.java
	public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
		this.helloWorldServiceFrench = helloWorldServiceFrench;
	}
	
	public String sayHello() {
		String greeting = helloWorldService.getGreeting();
		System.out.println(greeting);
		System.out.println(helloWorldServicePortuguese.getGreeting());
		System.out.println(helloWorldServiceFrench.getGreeting());
		return greeting;
	}
	
}
