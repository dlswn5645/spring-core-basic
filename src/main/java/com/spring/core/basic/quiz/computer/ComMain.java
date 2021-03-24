package com.spring.core.basic.quiz.computer;

import com.spring.core.basic.config.QuizAutoConfig;
import com.spring.core.basic.config.QuizConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComMain {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(QuizAutoConfig.class);

        Computer computer = context.getBean(Computer.class);

        computer.computerInfo();
    }
}
