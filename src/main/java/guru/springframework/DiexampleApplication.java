package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.GreetingController;

@SpringBootApplication
public class DiexampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiexampleApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}
}
