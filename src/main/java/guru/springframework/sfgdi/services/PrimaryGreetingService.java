package guru.springframework.sfgdi.services;

/**
 * stevmc created on 2/8/20
 */
public class PrimaryGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return "Hello World - From the PRIMARY Bean";
	}
}
