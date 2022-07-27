package com.autonation.taskmanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subtask {

    private final String Title;
    private final String Value;

    //Comemnt 
    public Subtask(
            @JsonProperty("Title") String title,
            @JsonProperty("Value") String value) {

        Title = title;
        Value = value;
    }

    public String getTitle() {
        return Title;
    }

    public String getValue() {
        return Value;
    }
}
