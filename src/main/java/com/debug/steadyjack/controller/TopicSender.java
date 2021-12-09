package com.debug.steadyjack.controller;

import com.debug.steadyjack.config.TopicConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Zhaoyongheng
 * @date: 2020/9/10
 */
@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void topicSender(String message) {
        String routingKey = "log.all.error";
        System.out.println(routingKey + " 发送消息：" + message);
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE_NAME, routingKey, message);
    }
}