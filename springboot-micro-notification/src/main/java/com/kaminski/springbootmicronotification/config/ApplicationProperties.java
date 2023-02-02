package com.kaminski.springbootmicronotification.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(value = "spring.backend")
public class ApplicationProperties {

    private String topicName;

}