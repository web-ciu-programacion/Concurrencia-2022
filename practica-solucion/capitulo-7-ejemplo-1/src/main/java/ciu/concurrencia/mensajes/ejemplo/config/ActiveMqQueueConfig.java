package ciu.concurrencia.mensajes.ejemplo.config;

import javax.annotation.PostConstruct;
import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class ActiveMqQueueConfig {

	@Value("${activemq.broker-url}")
	private String brokerUrl;
	
	@Value("${activemq.queue}")
	private String queue;

	@PostConstruct
	public void showConfig() {
		System.out.println("broker url: " + this.brokerUrl);
		System.out.println("queue: " + this.queue);
	}

	@Bean
	public Queue queue() {
		return new ActiveMQQueue(this.queue);
	}

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {

        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL(this.brokerUrl);
        return factory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        return  new JmsTemplate(activeMQConnectionFactory());
    }

}
