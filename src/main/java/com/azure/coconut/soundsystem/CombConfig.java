package com.azure.coconut.soundsystem;

import org.springframework.context.annotation.*;

@Configuration
@Import({CDConfig.class,CDPlayerConfig.class})
@ImportResource("spring-config.xml")
@EnableAspectJAutoProxy
public class CombConfig {
    @Bean
    public AzureCDPlayerAspect azureCDPlayerAspect(){
        return new AzureCDPlayerAspect();
    }
}
