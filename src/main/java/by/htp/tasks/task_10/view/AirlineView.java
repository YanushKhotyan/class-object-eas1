package by.htp.tasks.task_10.view;


import by.htp.tasks.task_10.bean.Airline;
import by.htp.tasks.task_10.service.AirlineService;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class AirlineView
{
    public static void main(String[] args)
    {
        AirlineView airlineView = new AirlineView();
        AirlineService airlineService = new AirlineService();
        airlineService.sortByDestination("Minsk");
    }

    public void print(Airline airlines)
    {
        System.out.println(airlines.toString());
    }
}
