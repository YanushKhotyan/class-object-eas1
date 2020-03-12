package by.htp.tasks.task_9.service;

import by.htp.tasks.task_9.bean.Book;

import java.util.Arrays;
import java.util.List;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class BookService
{
    public static List<Book> books = Arrays.asList(
            new Book(1, "Book1", "Author1", "Publish1", 2019, 234, 20, "Tough"),
            new Book(2, "Book2", "Author2", "Publish2", 2013, 453, 222, "Tough"),
            new Book(3, "Book3", "Author1", "Publish3", 1900, 1, 100000, "Light")
    );

    public void printByAuthor(List<Book> books, String author)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getAuthor().equals(author))
            {
                System.out.println(books.get(i).getName());
            }
        }
    }

    public void printByPublisher(List<Book> books, String publisher)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getPublisher().equals(publisher))
            {
                System.out.println(books.get(i).getName());
            }
        }
    }

    public void printByYear(List<Book> books, int year)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getYearOfPublishing() >= year)
            {
                System.out.println(books.get(i).getName());
            }
        }
    }
}
