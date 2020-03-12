package by.htp.tasks.task_8.view;

import by.htp.tasks.task_8.bean.Customer;
import by.htp.tasks.task_8.service.CustomerService;

import java.util.List;

import static by.htp.tasks.task_8.service.CustomerService.customers;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class CustomerView
{
    public static void main(String [] args){
        CustomerService customerService = new CustomerService();
        CustomerView view = new CustomerView();
        view.print(customerService.sortByAlfabet(customers));
        customerService.sortByCard(customers, 121, 324235262362342L);

    }

    public void print(List<Customer> customersSurname){
        for (Customer customer: customersSurname){
            System.out.println(customer.getSurname());
        }
    }



}
