package com.htp.jd.task1;

public class ServiceTask1 {

    private int sum(int number, int newNumber){
        return number + newNumber;
    }

    private int compare(int number, int newNumber){
        if (number > newNumber) {
            return number;
        }
        else {
            return newNumber;
        }
    }
}
