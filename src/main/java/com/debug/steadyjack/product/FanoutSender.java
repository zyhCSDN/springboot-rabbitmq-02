package com.debug.steadyjack.product;

import com.debug.steadyjack.config.TopicConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Zhaoyongheng
 * @date: 2020/9/10
 */
@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(String message) {
        System.out.println("发送消息：" + message);
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE_NAME,TopicConfig.QUEUE_NAME, message);
    }
    public void send2(String message) {
        System.out.println("发送消息2：" + message);
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE_NAME,TopicConfig.QUEUE_NAME2, message);
    }
}