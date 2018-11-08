package com.azure.coconut.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 创建JavaConfig类的关键在于为其添加@Configuration注解
 * Configuration注解表明这个类是一个配置类，该类应该包含在Spring应用上下文中如何创建bean的细节。*/
@Configuration
//@Import(CDConfig.class)
//@ComponentScan
public class CDPlayerConfig {
    @Bean
    public MediaPlayer mediaPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
