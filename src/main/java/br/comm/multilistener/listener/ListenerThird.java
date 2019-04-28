package br.comm.multilistener.listener;

import br.comm.multilistener.event.CustomSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
public class ListenerThird implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Received from ListenerThird spring custom event - " + event.getMessage());
    }
}
