package net.javaguides.springboot_kafka_study.kafaconfigration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic javaguidesTopics(){
        return TopicBuilder.name("javaguides").build();

    }
}
