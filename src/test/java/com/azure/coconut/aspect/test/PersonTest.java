package com.azure.coconut.aspect.test;

import com.azure.coconut.aspect.Person;
import com.azure.coconut.aspect.PersonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersonConfig.class)
public class PersonTest {
    @Autowired
    private Person person;

    @Test
    public void greeting(){
        /*
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person=(Person)applicationContext.getBean("franch");
        for(Method method: person.getClass().getMethods())
            System.out.println(method);
            */
        try {
            Person.class.getMethod("sayBye").invoke(person);
            person.getClass().getMethod("sayBye").invoke(person);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
