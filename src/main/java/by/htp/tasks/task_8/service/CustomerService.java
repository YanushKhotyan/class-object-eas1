package by.htp.tasks.task_8.service;

import by.htp.tasks.task_8.bean.Customer;

import java.util.Arrays;
import java.util.List;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class CustomerService
{
    public static List<Customer> customers = Arrays.asList(
            new Customer(1, "Petrov", "Vasia", "Minsk 12", 23L, 32423),
            new Customer(4, "Ivanov", "Petya", "Gomel 3", 436566565234L, 123),
            new Customer(34, "Ashin", "Ahmed", "Berlin", 32423123423423L, 1268989),
            new Customer(124, "Validya", "Frees", "Hrodno", 2342353324232344L, 123)
    );

    public List<Customer> sortByAlfabet(List<Customer> customers)
    {
        for (int i = 0; i < customers.size(); i++)
        {
            for (int j = i + 1; j < customers.size(); j++)
                if (customers.get(i).getSurname().compareTo(customers.get(j).getSurname()) > 0)
                {
                    if (customers.get(i).getSurname().equals(customers.get(j).getSurname()))
                    {
                        Customer id = sortById(customers.get(i), customers.get(j));
                        customers.set(i, customers.get(j));
                        customers.set(j, id);
                    }
                    else
                    {
                        Customer destination = customers.get(i);
                        customers.set(i, customers.get(j));
                        customers.set(j, destination);
                    }
                }
        }
        return customers;
    }

    private Customer sortById(Customer customerOne, Customer customerTwo)
    {
        if (customerOne.getId() > customerTwo.getId())
        {
            return customerOne;
        }
        else
        {
            return customerTwo;
        }
    }

    public void sortByCard(List<Customer> customers, int a, long b)
    {
        for (Customer customer : customers)
        {
            if (customer != null)
            {
                if (customer.getCreditCardNumber() >= a && customer.getCreditCardNumber() <= b)
                {
                    System.out.println(customer.getCreditCardNumber());
                }
            }
        }
    }
}
