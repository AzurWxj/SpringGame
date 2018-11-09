package com.azure.coconut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SayByeableIntroducer {
    @DeclareParents(
            value = "com.azure.coconut.aspect.Person+",
            defaultImpl = FranchSayBye.class
    )
    public static SayByeable byeable;
}
