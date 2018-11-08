package com.azure.coconut.soundsystem.test;

import com.azure.coconut.soundsystem.CDPlayerConfig;
import com.azure.coconut.soundsystem.CombConfig;
import com.azure.coconut.soundsystem.CompactDisc;
import com.azure.coconut.soundsystem.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//可能会发生异常：Caused by: java.lang.IllegalStateException: SpringJUnit4ClassRunner requires JUnit 4.12 or higher.

/**使用了Spring的SpringJUnit4ClassRunner，以便在测试开始的时候自动创建Spring的应用上下文*/
@RunWith(SpringJUnit4ClassRunner.class)
/**
 * 注解@ContextConfiguration会告诉它需要在CDPlayerConfig中加载配置。
 * 因为CDPlayerConfig类中包含了@ComponentScan，因此最终的应用上下文中应该包含CompactDisc bean。
 * */
@ContextConfiguration(classes = CombConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc disc;
    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(disc);
    }

    @Test
    public void playCd(){
        for(int i=0;i<50;i++)
        disc.play();
    }

    @Test
    public void cdPlay(){
        mediaPlayer.play();
    }

    @Test
    public void assertEqual(){
        assertEquals(disc,mediaPlayer.getCD());
    }
}
