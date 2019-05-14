package com.wxdemo.scheduled;

import com.example.wxdemo.main.WxdemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJobs {

    Logger logger = LoggerFactory.getLogger(Object.class);
    //@Scheduled(cron = "0/6 * * * * ?")
    public void scheduledTest() {
        logger.info("测试定时任务！！！！6秒一次");
        logger.debug("debug 6秒一次");
        System.out.println("测试定时任务！！！！6秒一次");
    }

   // @Scheduled(fixedRate = 3000)
    public void scheduledTest2() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("测试定时任务！！！！3秒一次，不管方法多长时间执行完，都是三秒执行一次。");
        logger.debug("debug 3秒一次，不管方法多长时间执行完，都是三秒执行一次。");
        System.out.println("测试定时任务！！！！3秒一次，不管方法多长时间执行完，都是三秒执行一次。");
    }

   // @Scheduled(fixedDelay = 3000)
    public void scheduledTest3() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("测试定时任务！！！！3秒一次，方法执行完之后三秒再执行。");
        logger.debug("debug 3秒一次，方法执行完之后三秒再执行。");
        System.out.println("测试定时任务！！！！3秒一次，方法执行完之后三秒再执行。");
    }

}
