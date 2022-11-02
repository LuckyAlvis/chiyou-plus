package com.shuwei.dai.schedule.task;

import com.shuwei.dai.schedule.service.FinanceTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@Configuration
@EnableScheduling
public class FinanceTask {

    @Autowired
    private FinanceTaskService financeTaskService;

    @Scheduled(cron = "0/5 * * * * ?")
    private void task() {
        financeTaskService.sendBillMail();
    }

}
