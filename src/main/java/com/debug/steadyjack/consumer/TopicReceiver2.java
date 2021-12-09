package com.debug.steadyjack.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: Zhaoyongheng
 * @date: 2020/9/10
 */
@Component
@RabbitListener(queues = "log.all")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("log.* 消费消息：" + msg);
    }
}