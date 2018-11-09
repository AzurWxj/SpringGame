package com.azure.coconut.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

@Configuration
public class CDConfig {
    @Bean
    @Profile("azure-cd")
    public CompactDisc getAzureCD(){
        return new AzureCD();
    }

    @Bean
    @Profile("kyrin-cd")
    public CompactDisc getKyrinCD(){
        return new KyrinCD();
    }
}
