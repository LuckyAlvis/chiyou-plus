package com.shuwei.dai.schedule.service.impl;

import com.shuwei.dai.common.mail.utils.ChiyouMailHelper;
import com.shuwei.dai.schedule.service.FinanceTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class FinanceTaskServiceImpl implements FinanceTaskService {

    @Value("${mail.myEmailAccount}")
    String myEmailAccount;

    @Value("${mail.myEmailPassword}")
    String myEmailPassword;

    @Value("${mail.senderPersonalName}")
    String senderPersonalName;

    @Override
    public void sendBillMail() {
        log.error("财务定时任务执行{}", LocalDateTime.now());
        try {
            ChiyouMailHelper.sendMail(myEmailAccount,
                    myEmailPassword,
                    senderPersonalName,
                    "252127196@qq.com",
                    "主题",
                    "test text");
        } catch (Exception e) {
            log.error("send Bill email error", e);
        }
    }
}
