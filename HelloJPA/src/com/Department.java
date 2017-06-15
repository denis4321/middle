package com;

import javax.persistence.Embeddable;

/**
 * Created by denys on 6/15/2017.
 */
@Embeddable
public class Department {
    private String title;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
