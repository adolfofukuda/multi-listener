package br.comm.multilistener;

import br.comm.multilistener.publisher.CustomSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"br.com.common" ,"br.comm.multilistener"})
@ComponentScan(basePackages = {"br.com.common" ,"br.comm.multilistener"})
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
