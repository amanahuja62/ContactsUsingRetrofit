package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class People {
    @SerializedName("contacts")
    List<Personn> peopleList;
    public People(List<Personn> peopleList) {
        this.peopleList = peopleList;
    }

    public List<Personn> getPeopleList() {
        return peopleList;
    }
}
