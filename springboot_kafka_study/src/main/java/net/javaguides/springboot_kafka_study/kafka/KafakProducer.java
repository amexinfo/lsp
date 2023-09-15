package net.javaguides.springboot_kafka_study.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafakProducer {
    private  static Logger LOGGER= LoggerFactory.getLogger(KafakProducer.class);
    private KafkaTemplate<String,String>kafkaTemplate;

    public KafakProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public  void sendMassage(String message){
        LOGGER.info(String.format("message sen %", message));
        kafkaTemplate.send("javaguides",message);

    }
}
