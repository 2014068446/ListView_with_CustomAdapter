package com.example.donnald.listview.Model;

/**
 * Created by Donnald on 9/7/2017.
 */

public class College {
    private int logo;
    private String name;
    private String year;

    public College(int logo, String name, String year) {
        this.logo = logo;
        this.name = name;
        this.year = year;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
