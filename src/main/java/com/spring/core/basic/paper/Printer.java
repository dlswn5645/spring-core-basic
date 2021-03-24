package com.spring.core.basic.paper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //컴포넌트 스캔 대상
// @Service @Controller @Repository @Configuration 내용은 같지만 구분하는 용도
public class Printer {

//    @Autowired //필드로 주입 가능 - but 외부에서 변경이 불가능해서 테스트하기 힘듬, DI프레임워크가 없으면 아무것도 할 수 없음
    private final Paper paper;

    @Autowired //(생성자로 주입 가능)auto로 주입 대상을 찾음 - paper bean을 찾음,생략가능
    public Printer(Paper paper) {
        this.paper = paper;
    }

   /* @Autowired //setter로 주입 가능
    public void setPaper(Paper paper) {
        this.paper = paper;
    }*/

    //용지 출력 기능
    public void printPaper(){
        System.out.println("====== 출력 내용 =====");
        for(String data: paper.datas){
            System.out.println("# " + data);
        }
    }
}
