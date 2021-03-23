package com.spring.core.basic.paper;

public class Printer {

    private Paper paper;

    public Printer(Paper paper) {
        this.paper = paper;
    }

    //용지 출력 기능
    public void printPaper(){
        System.out.println("====== 출력 내용 =====");
        for(String data: paper.datas){
            System.out.println("# " + data);
        }
    }
}
