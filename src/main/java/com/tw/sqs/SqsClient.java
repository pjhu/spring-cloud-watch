package com.tw.sqs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableSqs
@Component
public class SqsClient {

    private static final Logger LOG = LoggerFactory.getLogger(SqsClient.class);

    private static final String QUEUE_NAME = "test-cloud-watch";

    @SqsListener(value = QUEUE_NAME)
    public void myQueueListener(String message) throws Exception{
        LOG.info("Message Listen start");
        LOG.info(message);

    }
}