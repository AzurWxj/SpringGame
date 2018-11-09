package com.azure.coconut.soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AzureCDPlayerAspect {

    @Before("execution(** com.azure.coconut.soundsystem.MediaPlayer.play(..))")
    public void sing(){
        System.out.println("La La La...Azure CD will play");
    }
}
