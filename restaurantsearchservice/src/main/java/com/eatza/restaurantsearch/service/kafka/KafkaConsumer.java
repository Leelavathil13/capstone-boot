package com.eatza.restaurantsearch.service.kafka;

import java.io.IOException;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	    @KafkaListener(topics = "java_in_use_topic", groupId = "group_id")
	    public void consume(String message) throws IOException {
	        System.out.println("kafka message-"+message);
	    }
}
