package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
	@Profile("english")
	//Primary
	//Indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency. 
	//If exactly one 'primary' bean exists among the candidates, it will be the autowired value.
	@Primary
	public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
	
	@Bean
	@Profile({"spanish"})
	@Primary
	public HelloWorldService helloWorldServiceSpanish (HelloWorldFactory factory) {
		return factory.createHelloWorldService("es");
	}
	
	@Bean
	public HelloWorldService helloWorldServicePortuguese (HelloWorldFactory factory) {
		return factory.createHelloWorldService("pt");
	}
	//You can also name your beans
	@Bean(name = "french")
	public HelloWorldService helloWorldServiceFrench (HelloWorldFactory factory) {
		return factory.createHelloWorldService("fr");
	}
	
}