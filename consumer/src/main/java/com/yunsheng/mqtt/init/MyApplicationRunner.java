package com.yunsheng.mqtt.init;

import com.yunsheng.mqtt.config.PushCallback;
import com.yunsheng.mqtt.service.IMqttSubscribe;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * <desc>
 *      启动MQTT订阅
 * </desc>
 * @author yunsheng
 * @createDate 2018/12/7
 */
@Slf4j
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Autowired
    private IMqttSubscribe iMqttSubscribe;

    String TOPIC = "MQTT_PRODUCER_TOPIC";

    private final static Logger log = LoggerFactory.getLogger(PushCallback.class);


    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info(" MQTT Subscribe Server 开始...");
        iMqttSubscribe.subscribe(TOPIC);
    }
}
