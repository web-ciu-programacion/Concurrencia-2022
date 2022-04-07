package ciu.concurrencia.mensajes.ejemplo.server;

import org.springframework.stereotype.Component;

/*
 *  Listener que consume mensajes de la queue siempre que haya.
 */

@Component
public class ActiveMqServer {

//	@JmsListener(destination = ActiveMqQueueConfig.QUEUE_NAME)
//	public void receiveQueue(String message) {
//		System.out.println ("Monitor de cola: " + ActiveMqQueueConfig.QUEUE_NAME);
//		System.out.println(message);
//	}

}
