package com.spring.core.basic.config;

import com.spring.core.basic.paper.Paper;
import com.spring.core.basic.paper.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    //Printer 빈이 등록, bean의 이름은 printer
    @Bean
    public Printer printer() {

        return new Printer(paper());
    }

    //Paper 빈이 등록 bean의 이름은 paper
    @Bean
    public Paper paper(){
        return new Paper();
    }
}
