package com.spring.core.basic.quiz.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

//    @Autowired
    private final Monitor monitor;
//    @Autowired
    private final KeyBoard keyBoard;
//    @Autowired
    private final Mouse mouse;

    @Autowired
    public Computer(Monitor monitor, KeyBoard keyBoard, Mouse mouse) {
        this.monitor = monitor;
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

   /* @Autowired
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Autowired
    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Autowired
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }*/

    public void computerInfo() {
        monitor.info();
        keyBoard.info();
        mouse.info();
    }
}
