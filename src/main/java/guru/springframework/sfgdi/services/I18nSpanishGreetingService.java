package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * stevmc created on 2/8/20
 */
@Profile("ES")
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES";
	}
}
