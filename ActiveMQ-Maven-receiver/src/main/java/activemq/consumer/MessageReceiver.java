package activemq.consumer;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MessageReceiver implements MessageListener {

	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			try {
				String text = textMessage.getText();
				//System.out.println("ActiveMQ-Maven-receiver接收到消息: " + text);
				int parseInt = Integer.parseInt(text);
				System.out.println("ActiveMQ-Maven-receiver接收到消息: "+(parseInt+1)+",时间:"+new Date());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
