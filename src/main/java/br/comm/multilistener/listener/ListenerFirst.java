package br.comm.multilistener.listener;

import br.comm.multilistener.event.CustomSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerFirst implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Received from ListenerFirst spring custom event - " + event.getMessage());
    }
}
