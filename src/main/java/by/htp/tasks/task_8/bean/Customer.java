package by.htp.tasks.task_8.bean;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Customer
{
    private int id;
    private String surname;
    private String name;
    private String address;
    private long creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String surname, String name, String address, long creditCardNumber, int bankAccountNumber)
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public long getCreditCardNumber()
    {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber()
    {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber)
    {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
