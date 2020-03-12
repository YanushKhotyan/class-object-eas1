package by.htp.tasks.task_7.bean;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Triangle
{
    private int сathetAB;
    private int сathetBC;
    private int сathetCA;

    private int medianaAK;
    private int medianaBL;
    private int medianaCN;

    private int area;
    private int perimeter;

    public Triangle(int сathetAB, int сathetBC, int сathetCA)
    {
        this.сathetAB = сathetAB;
        this.сathetBC = сathetBC;
        this.сathetCA = сathetCA;
    }

    public int getСathetAB()
    {
        return сathetAB;
    }

    public void setСathetAB(int сathetAB)
    {
        this.сathetAB = сathetAB;
    }

    public int getСathetBC()
    {
        return сathetBC;
    }

    public void setСathetBC(int сathetBC)
    {
        this.сathetBC = сathetBC;
    }

    public int getСathetCA()
    {
        return сathetCA;
    }

    public void setСathetCA(int сathetCA)
    {
        this.сathetCA = сathetCA;
    }

    public int getMedianaAK()
    {
        return сathetBC / 2;
    }


    public int getMedianaBL()
    {
        return сathetCA / 2;
    }

    public int getMedianaCN()
    {
        return сathetAB / 2;
    }

    public int getArea()
    {
        return (сathetCA + сathetBC + сathetAB) / 2;
    }

    public int getPerimeter()
    {
        return сathetCA + сathetBC + сathetAB;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return сathetAB == triangle.сathetAB &&
                сathetBC == triangle.сathetBC &&
                сathetCA == triangle.сathetCA &&
                medianaAK == triangle.medianaAK &&
                medianaBL == triangle.medianaBL &&
                medianaCN == triangle.medianaCN &&
                area == triangle.area &&
                perimeter == triangle.perimeter;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(сathetAB, сathetBC, сathetCA, medianaAK, medianaBL, medianaCN, area, perimeter);
    }

    @Override
    public String toString()
    {
        return "Triangle{" +
                "сathetAB=" + сathetAB +
                ", сathetBC=" + сathetBC +
                ", сathetCA=" + сathetCA +
                ", medianaAK=" + medianaAK +
                ", medianaBL=" + medianaBL +
                ", medianaCN=" + medianaCN +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
