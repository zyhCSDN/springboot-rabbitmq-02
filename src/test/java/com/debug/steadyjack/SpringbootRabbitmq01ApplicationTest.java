package com.debug.steadyjack;

import com.debug.steadyjack.product.FanoutSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Zhaoyongheng
 * @date: 2020/9/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmq01ApplicationTest {

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void configure() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        fanoutSender.send("Time1 => " + sf.format(new Date()));
        fanoutSender.send2("Date2 => " + sf.format(new Date()));
        System.out.println("1111");
    }
}
