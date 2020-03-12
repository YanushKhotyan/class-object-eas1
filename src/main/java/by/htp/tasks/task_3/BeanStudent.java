package com.htp.jd.task3;

import java.util.Arrays;
import java.util.Objects;

public class BeanStudent {
    private String name;
    private String surname;
    private int groupNumber;
    private int[] marks = new int[5];

    public BeanStudent(String name, String surname, int groupNumber, int[] marks) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public BeanStudent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeanStudent that = (BeanStudent) o;
        return groupNumber == that.groupNumber &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Arrays.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, groupNumber);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "BeanStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
