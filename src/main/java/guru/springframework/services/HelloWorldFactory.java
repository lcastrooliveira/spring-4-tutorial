package guru.springframework.services;

public class HelloWorldFactory {

	public HelloWorldService createHelloWorldService(String language) {
		HelloWorldService service = null;
		
		switch (language) {
		case "en":
			service = new HelloWorldServiceEnglishImpl();
			break;
		case "es":
			service = new HelloWorldServiceSpanishImpl();
			break;
		case "pt":
			service = new HelloWorldServicePortugueseImpl();
			break;	
		case "fr":
			service = new HelloWorldServiceFrenchImpl();
			break;	
		default: new HelloWorldServiceEnglishImpl();
			
		}
		return service;
	}
}
