package by.htp.tasks.task_6.view;

import by.htp.tasks.task_6.bean.Time;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class ViewTime
{
    public static void main(String [] args){
        ViewTime view = new ViewTime();
        Time time = new Time(50,43,59);

        view.printTime(time.getHour(), time.getMinute(), time.getSecond());
        time.setMinute(60);
        view.printTime(time.getHour(), time.getMinute(), time.getSecond());
        time.setMinute(60);
        view.printTime(time.getHour(), time.getMinute(), time.getSecond());
        time.setSecond(5);
        time.setMinute(15);
        time.setHour(20);
        view.printTime(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void printTime(int hour, int minute, int second){
        System.out.println(hour + " hour" + " " + minute + " minutes " + " " + second + " second ");
    }
}
