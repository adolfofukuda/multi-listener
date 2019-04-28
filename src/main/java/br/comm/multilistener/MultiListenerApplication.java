package br.comm.multilistener;

import br.comm.multilistener.event.CustomSpringEvent;
import br.comm.multilistener.publisher.CustomSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiListenerApplication implements CommandLineRunner {
	@Autowired
	private CustomSpringEventPublisher customSpringEventPublisher;

	public static void main(String[] args) {
		SpringApplication.run(MultiListenerApplication.class, args);
	}

	@Override
	public void run(String... args) {
		customSpringEventPublisher.doStuffAndPublishAnEvent("Ola");
	}
}
