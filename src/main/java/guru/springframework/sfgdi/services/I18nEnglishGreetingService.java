package guru.springframework.sfgdi.services;

/**
 * stevmc created on 2/8/20
 */
public class I18nEnglishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return "Hello World - EN";
	}
}
