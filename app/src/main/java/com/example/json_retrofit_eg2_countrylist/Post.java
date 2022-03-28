package com.example.json_retrofit_eg2_countrylist;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int id;
    private int numcode;
    private int phonecode;
    private String sortname;
    private String name;

    public int getId() {
        return id;
    }

    public int getNumcode() {
        return numcode;
    }

    public int getPhonecode() {
        return phonecode;
    }

    public String getSortname() {
        return sortname;
    }

    public String getName() {
        return name;
    }
}
