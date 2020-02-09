package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * stevmc created on 2/8/20
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello Workd - From the PRIMARY Bean";
	}
}
