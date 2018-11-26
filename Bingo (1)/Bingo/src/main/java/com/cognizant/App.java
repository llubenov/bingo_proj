package com.cognizant;

import com.cognizant.service.IAccountGenerator;
import com.cognizant.service.Validator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Validator validator = new Validator();

        IAccountGenerator generator = appContext.getBean("accountGenSix", IAccountGenerator.class);
        IAccountGenerator generator1 = appContext.getBean("accountGenEight", IAccountGenerator.class);
        IAccountGenerator generator2 = appContext.getBean("accountGenTen", IAccountGenerator.class);

        System.out.println(generator.generator(validator));
        System.out.println(generator1.generator(validator));
        System.out.println(generator2.generator(validator));
    }
}
