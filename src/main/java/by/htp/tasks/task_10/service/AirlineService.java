package by.htp.tasks.task_10.service;

import by.htp.tasks.task_10.bean.Airline;
import by.htp.tasks.task_10.bean.Date;
import by.htp.tasks.task_10.bean.DayOfWeek;


import java.util.Arrays;
import java.util.List;

import static by.htp.tasks.task_10.bean.DayOfWeek.*;


/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class AirlineService
{
    private List<Airline> airlines = Arrays.asList(
            new Airline("Minsk", 1234, "Boing", FRIDAY, new Date(14, 33, 0)),
            new Airline("NewYork", 34, "Jet", SUNDAY, new Date(23, 12, 3)),
            new Airline("Minsk", 124, "GolfStream", WEDNESDAY, new Date(7, 30, 6)),
            new Airline("Vein", 1, "MilitaryPlain", MONDAY, new Date(3, 40, 1)),
            new Airline("Minsk", 34, "Boing", FRIDAY, new Date(16, 33, 0)));

    public void sortByDestination(String destination)
    {
        for (int i = 0; i < airlines.size(); i++)
        {
            if (airlines.get(i).getDestination().equals(destination))
            {
                System.out.println(airlines.get(i));
            }
        }
    }

    public void sortByHour(int hour)
    {
        for (int i = 0; i < airlines.size(); i++)
        {
            if (airlines.get(i).getDepartureTime().getHour() == hour)
            {
                System.out.println(airlines.get(i));
            }
        }
    }

    public void sortByDayOfTheWeek(DayOfWeek DayOfWeek, Date date)
    {
        switch (DayOfWeek)
        {
            case FRIDAY:
                for (int i = 0; i < airlines.size(); i++)
                {
                    if (airlines.get(i).getDepartureTime().getHour() > date.getHour()
                            && airlines.get(i).getDestination().equals(FRIDAY))
                    {
                        System.out.println(airlines.get(i));
                    }
                }
                break;
            case MONDAY:
                for (int i = 0; i < airlines.size(); i++)
                {
                    if (airlines.get(i).getDepartureTime().getHour() > date.getHour()
                            && airlines.get(i).getDestination().equals(MONDAY))
                    {
                        System.out.println(airlines.get(i));
                    }
                }
            case TUESDAY:
                for (int i = 0; i < airlines.size(); i++)
                {
                    if (airlines.get(i).getDepartureTime().getHour() > date.getHour()
                            && airlines.get(i).getDestination().equals(TUESDAY))
                    {
                        System.out.println(airlines.get(i));
                    }
                }
            case WEDNESDAY:
                for (int i = 0; i < airlines.size(); i++)
                {
                    if (airlines.get(i).getDepartureTime().getHour() > date.getHour()
                            && airlines.get(i).getDestination().equals(WEDNESDAY))
                    {
                        System.out.println(airlines.get(i));
                    }
                }
            case SUNDAY:
                for (int i = 0; i < airlines.size(); i++)
                {
                    if (airlines.get(i).getDepartureTime().getHour() > date.getHour()
                            && airlines.get(i).getDestination().equals(SUNDAY))
                    {
                        System.out.println(airlines.get(i));
                    }
                }
        }
    }
}
