package com.azure.coconut.webvalidation;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 使用hibernate validator 做验证时要添加
 * 如以下的依赖：
 * <dependency>
 *             <groupId>org.hibernate.validator</groupId>
 *             <artifactId>hibernate-validator</artifactId>
 *             <version>6.0.2.Final</version>
 *         </dependency>
 *  而根据[Hibernate Validator Specification](http://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-gettingstarted-createproject)
 *  知道，如果是在SE环境中，需要同时导入
 *  <dependency>
 *             <groupId>org.glassfish</groupId>
 *             <artifactId>javax.el</artifactId>
 *             <version>3.0.1-b09</version>
 *         </dependency>
 *   依赖作为EL语言
 */
public class Person {

    @NotNull
    @Size(min=4,max=18,message = "姓名不能小于4个字符，且不能大于18个字符")
    private String name;

    @Min(value = 0,message = "年龄不能为负数")
    @Max(value = 100,message = "年龄不能大于100")
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
