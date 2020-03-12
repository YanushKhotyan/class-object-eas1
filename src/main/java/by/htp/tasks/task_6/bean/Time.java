package by.htp.tasks.task_6.bean;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * Bean Time
 */
public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second)
    {
        if (hour >= 0 && hour < 24)
        {
            this.hour = hour;
            if (minute >= 0 && minute < 60)
            {
                this.minute = minute;
                if (second >= 0 && second < 60)
                {
                    this.second = second;
                }
            }
        }
        else
        {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        if (hour >= 0 && hour < 24)
        {
            this.hour = hour;
        }
        else
        {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        if (minute >= 0 && minute < 60)
        {
            this.minute = minute;
        }
        else
        {
            if (hour < 23)
            {
                this.hour++;
                this.minute = 0;
                this.second = 0;
            }
            else
            {
                this.hour = 0;
                this.minute = 0;
                this.second = 0;
            }
        }
    }

    public int getSecond()
    {
        return second;
    }

    public void setSecond(int second)
    {
        if (second >= 0 && second < 60)
        {
            this.second = second;
        }
        else
        {
            this.minute++;
            this.second = 0;
        }
    }

    @Override
    public String toString()
    {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
