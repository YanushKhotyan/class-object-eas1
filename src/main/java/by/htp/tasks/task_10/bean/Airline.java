package by.htp.tasks.task_10.bean;


/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Airline
{
    private String destination;
    private int flightNumber;
    private String typeOfPlane;
    private DayOfWeek daysOfTheWeek;
    private Date departureTime;

    public Airline(String destination, int flightNumber, String typeOfPlane, DayOfWeek daysOfTheWeek, Date departureTime)
    {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfPlane = typeOfPlane;
        this.daysOfTheWeek = daysOfTheWeek;
        this.departureTime = departureTime;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public int getFlightNumber()
    {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfPlane()
    {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane)
    {
        this.typeOfPlane = typeOfPlane;
    }

    public DayOfWeek getDaysOfTheWeek()
    {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(DayOfWeek daysOfTheWeek)
    {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public Date getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime)
    {
        this.departureTime = departureTime;
    }

    @Override
    public String toString()
    {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeOfPlane='" + typeOfPlane + '\'' +
                ", daysOfTheWeek='" + daysOfTheWeek + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }
}
