package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingRepository;
import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * stevmc created on 2/14/20
 */
@Configuration
public class GreetingServiceConfiguration {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}

	@Primary
	@Bean
	@Profile({ "default" })
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("");
	}

	@Primary
	@Bean
	@Profile({ "en" })
	GreetingService primaryEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}

	@Primary
	@Bean
	@Profile("es")
	GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}

	@Primary
	@Bean
	@Profile("de")
	GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}
}
