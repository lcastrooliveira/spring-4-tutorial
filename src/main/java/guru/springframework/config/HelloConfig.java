package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.services.HelloWorldFactory;
import guru.springframework.services.HelloWorldService;

//Normally used when you're using a third party library
@Configuration
public class HelloConfig {

	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	}
	
	@Bean
	@Profile({"default","english"})
	public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
	
	@Bean
	@Profile({"spanish"})
	public HelloWorldService helloWorldServiceSpanish (HelloWorldFactory factory) {
		return factory.createHelloWorldService("es");
	}
	
}