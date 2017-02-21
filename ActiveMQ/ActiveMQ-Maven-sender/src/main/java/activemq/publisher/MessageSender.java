package activemq.publisher;

import java.util.Date;

import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;

public class MessageSender {

	private final JmsTemplate jmsTemplate;
	private final Destination destination;

	public MessageSender(final JmsTemplate jmsTemplate, final Destination destination) {
		this.jmsTemplate = jmsTemplate;
		this.destination = destination;
	}

	public void send(final String text) {
		try {
			jmsTemplate.setDefaultDestination(destination);
			jmsTemplate.convertAndSend(text);
			System.out.println("ActiveMQ-Maven-sender发送消息 : " + text+",时间:"+new Date());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
