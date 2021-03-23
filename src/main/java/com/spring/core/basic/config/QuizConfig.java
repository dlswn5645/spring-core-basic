package com.spring.core.basic.config;

import com.spring.core.basic.quiz.computer.Computer;
import com.spring.core.basic.quiz.computer.KeyBoard;
import com.spring.core.basic.quiz.computer.Monitor;
import com.spring.core.basic.quiz.computer.Mouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuizConfig {

    @Bean
    public Computer computer(){
        return new Computer(
                monitor(),keyBoard(),mouse()
        );
    }

    @Bean
    public KeyBoard keyBoard(){
        return new KeyBoard();
    }

    @Bean
    public Mouse mouse(){
        return new Mouse();
    }

    @Bean
    public Monitor monitor(){
        return new Monitor();
    }
}
