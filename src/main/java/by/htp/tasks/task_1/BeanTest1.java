package com.htp.jd.task1;

import java.util.Objects;

public class BeanTest1 {
    private int number;
    private int newNumber;

    public BeanTest1() {
    }

    public BeanTest1(int number, int newNumber) {
        this.number = number;
        this.newNumber = newNumber;
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

    @Override
    public String toString() {
        return "Test1{" +
                "number=" + number +
                ", newNumber=" + newNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeanTest1 test1 = (BeanTest1) o;
        return number == test1.number &&
                newNumber == test1.newNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, newNumber);
    }
}
