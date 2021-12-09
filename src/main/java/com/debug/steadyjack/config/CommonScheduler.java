package com.debug.steadyjack.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: Zhaoyongheng
 * @date: 2019/9/26
 */
@Component
@EnableAsync
public class CommonScheduler {


    private static final Logger log = LoggerFactory.getLogger(CommonScheduler.class);

    //定时任务1
    @Scheduled(cron = "0/5 * * * * *")
    @Async("taskExecutor")
    public void schedulerOne() {
        log.info("---执行定时任务1---");
    }

    //定时任务2
    @Scheduled(cron = "0/6 * * * * *")
    @Async("taskExecutor")
    public void schedulerTwo() {
        log.info("---执行定时任务2---");

        try {
            //模拟当前定时任务每次执行业务逻辑时需要花费的时间 3s
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //定时任务3
    @Scheduled(cron = "0/7 * * * * *")
    @Async("taskExecutor")
    public void schedulerThree() {
        log.info("---执行定时任务3---");

        try {
            //模拟当前定时任务每次执行业务逻辑时需要花费的时间 4s  为什么要用sleep，主要是为了暂停当前线程，把cpu片段让出给其他线程，减缓当前线程的执行
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}