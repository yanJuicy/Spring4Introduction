package sample.spring_di;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener {

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("*** ContextRefreshedEvent ***");
	}

}
