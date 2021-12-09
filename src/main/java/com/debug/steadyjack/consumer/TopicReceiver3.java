package com.debug.steadyjack.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: Zhaoyongheng
 * @date: 2020/9/10
 */
@Component
@RabbitListener(queues = "log.all.error")
public class TopicReceiver3 {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("log.*.error 消费消息：" + msg);
    }
}
