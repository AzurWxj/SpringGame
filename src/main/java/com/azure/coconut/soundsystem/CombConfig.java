package com.azure.coconut.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDConfig.class,CDPlayerConfig.class})
@ImportResource("spring-config.xml")
public class CombConfig {
}
