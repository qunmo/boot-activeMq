package sjz.sgy.lb.activeMq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumerListener
{
    //topic模式的消费者
    @JmsListener(destination=ActiveMqConstant.TOPIC_NANE, containerFactory="topicListener")
    public void readActiveQueue(String message) {
        System.out.println("topic接受到：" + message);
    }
}