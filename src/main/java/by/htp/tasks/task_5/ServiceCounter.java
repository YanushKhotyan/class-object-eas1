package com.htp.jd.task5;

public class ServiceCounter {
    BeanCounter counter = new BeanCounter();

    private void increase(){
        counter.setValue(counter.getValue()+1);
    }

    private void decrease(){
        counter.setValue(counter.getValue()-1);
    }

    private int currentState(){
       return counter.getValue();
    }
}
