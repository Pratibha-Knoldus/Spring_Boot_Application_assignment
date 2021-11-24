package net.springkafkaassignment.springkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my_topic", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println(message);
    }
}
