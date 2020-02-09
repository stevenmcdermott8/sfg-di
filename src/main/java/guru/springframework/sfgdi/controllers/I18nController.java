package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * stevmc created on 2/8/20
 */
@Controller
public class I18nController {

	private final GreetingService greetingService;

	public I18nController(
			@Qualifier("I18nService")
					GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
