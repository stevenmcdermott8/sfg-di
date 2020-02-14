package guru.springframework.sfgdi.services;

/**
 * stevmc created on 2/8/20
 */
public class I18nSpanishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public I18nSpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES";
	}
}
