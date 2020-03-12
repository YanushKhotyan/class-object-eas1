package com.htp.jd.task2;

public class BeanTest2 {
    private int number;
    private int newNumber;

    public BeanTest2(int number, int newNumber) {
        this.number = number;
        this.newNumber = newNumber;
    }

    public BeanTest2() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }
}
