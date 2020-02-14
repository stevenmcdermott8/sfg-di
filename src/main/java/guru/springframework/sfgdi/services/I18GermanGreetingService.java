package guru.springframework.sfgdi.services;

/**
 * stevmc created on 2/8/20
 */
public class I18GermanGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public I18GermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return "Hallo Welt - DE";
	}
}
