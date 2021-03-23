package com.spring.core.basic.quiz.computer;

public class Computer {

    private Monitor monitor;
    private KeyBoard keyBoard;
    private Mouse mouse;

    public Computer(Monitor monitor, KeyBoard keyBoard, Mouse mouse) {
        this.monitor = monitor;
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public void computerInfo() {
        monitor.info();
        keyBoard.info();
        mouse.info();
    }
}
