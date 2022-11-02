package com.shuwei.dai.lock.util;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

@Component
public class LockUtils {

    @Resource
    private RedissonClient redisson;

    /**
     * 获取锁
     *
     * @param key 分布式锁KEY
     * @return 锁实例
     */
    public RLock getLock(String key) {
        return redisson.getLock(key);
    }

    /**
     * 获取锁并尝试加锁，开启看门狗
     *
     * @param key 分布式锁KEY
     * @return 加锁结果
     */
    public boolean getAndTryRLock(String key) {
        RLock lock = redisson.getLock(key);
        if (!Objects.isNull(lock)) {
            return lock.tryLock();
        }
        return false;
    }
}
