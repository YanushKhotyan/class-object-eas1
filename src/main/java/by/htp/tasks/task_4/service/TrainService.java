package by.htp.tasks.task_4.service;

import by.htp.tasks.task_10.bean.Date;
import by.htp.tasks.task_4.bean.Train;

import java.util.Arrays;
import java.util.List;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class TrainService
{
    private static List<Train> trains = Arrays.asList(
            new Train("CMinsk", 21, new Date(12, 30, 30)),
            new Train("Prague", 105, new Date(14, 0, 45)),
            new Train("AMoscow", 48, new Date(2, 21, 33)),
            new Train("CMinsk", 2, new Date(21, 5, 12)),
            new Train("DVein", 8, new Date(8, 59, 59)));


    /**
     * вывод поезда по номеру
     */
    public Train getTrainInfoByTrainNumber(int trainNumber)
    {
        for (Train train : trains)
        {
            if (train.getTrainNumber() == trainNumber)
                return train;
        }
        return null;
    }

    public void printTrain(Train train)
    {
        if (train != null)
        {
            System.out.println(train.toString());
        }
        else
        {
            System.out.println("Поезда с таким номерам нет");
        }
    }

    public void printTrainInformationBoard(List<Train> train)
    {
        if (train != null)
        {
            System.out.println(train.toString());
        }
        else
        {
            System.out.println("Поезда с таким номерам нет");
        }
    }

    /**
     * Поиск по пункту назначения и дате
     */
    public List<Train> sortTrainInfoByTrainDestination()
    {
        for (int i = 0; i < trains.size(); i++)
        {
            for (int j = i + 1; j < trains.size(); j++)
                if (trains.get(i).getTrainDestination().compareTo(trains.get(j).getTrainDestination()) < 0)
                {
                    if (trains.get(i).getTrainDestination().equals(trains.get(j).getTrainDestination()))
                    {
                        Train destination = sortByDate(trains.get(i), trains.get(j));
                        trains.set(i, trains.get(j));
                        trains.set(j, destination);
                    }
                    else
                    {
                        Train destination = trains.get(i);
                        trains.set(i, trains.get(j));
                        trains.set(j, destination);
                    }

                }
        }
        return trains;
    }

    /**
     * сортировка поезда по дате
     */
    private Train sortByDate(Train train, Train trainTwo)
    {
        if (train.getTrainDepartureTime().getHour() > trainTwo.getTrainDepartureTime().getHour())
        {
            return train;
        }
        else if (train.getTrainDepartureTime().getHour() < trainTwo.getTrainDepartureTime().getHour())
        {
            return trainTwo;
        }
        else if (train.getTrainDepartureTime().getHour() == trainTwo.getTrainDepartureTime().getHour())
        {
            if (train.getTrainDepartureTime().getMinute() > trainTwo.getTrainDepartureTime().getMinute())
            {
                return train;
            }
            else if (train.getTrainDepartureTime().getMinute() < trainTwo.getTrainDepartureTime().getMinute())
            {
                return trainTwo;
            }
            else if (train.getTrainDepartureTime().getMinute() == trainTwo.getTrainDepartureTime().getMinute())
            {
                if (train.getTrainDepartureTime().getSecond() > trainTwo.getTrainDepartureTime().getSecond())
                {
                    return train;
                }
                else if (train.getTrainDepartureTime().getSecond() < trainTwo.getTrainDepartureTime().getSecond())
                {
                    return trainTwo;
                }
                else if (train.getTrainDepartureTime().getSecond() == trainTwo.getTrainDepartureTime().getSecond())
                {
                    return train;
                }
            }
        }
        return null;
    }
}
