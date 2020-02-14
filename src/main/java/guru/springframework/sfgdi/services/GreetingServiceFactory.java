package guru.springframework.sfgdi.services;

/**
 * stevmc created on 2/14/20
 */
public class GreetingServiceFactory {

	private GreetingRepository greetingsRepository;

	public GreetingServiceFactory(GreetingRepository greetingsRepository) {
		this.greetingsRepository = greetingsRepository;
	}

	public GreetingService createGreetingService(String language) {

		switch (language) {
		case "en":
			return new I18nEnglishGreetingService(greetingsRepository);
		case "de":
			return new I18GermanGreetingService(greetingsRepository);
		case "es":
			return new I18nSpanishGreetingService(greetingsRepository);
		default:
			return new PrimaryGreetingService(greetingsRepository);
		}
	}
}
