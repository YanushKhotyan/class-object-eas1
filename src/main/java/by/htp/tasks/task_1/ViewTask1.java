package com.htp.jd.task1;

import by.htp.jd6.classs.B;

public class ViewTask1 {
    BeanTest1 bean = new BeanTest1(1,3);

    public void print(int sum){
        System.out.println("New value is " + sum);
    }

    public void print(){
        System.out.println(bean.getNumber() + " and " + bean.getNumber());
    }
}
