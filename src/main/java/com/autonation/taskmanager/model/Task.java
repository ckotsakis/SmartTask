package com.autonation.taskmanager.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;

public class Task {

    private final String Title;
    private final String Description;
    private final Date Created_Date;
    private final Date Due_Date;
    private final String Assignment;
    private final String Status;
    private final ArrayList<Subtask> SubTasks;

    public Task (
            @JsonProperty("Title") String Title,
            @JsonProperty("Description") String Description,
            @JsonProperty("Created_Date") Date Created_Date,
            @JsonProperty("Due Date") Date Due_Date,
            @JsonProperty("Assignment") String Assignment,
            @JsonProperty("Status") String Status,
            @JsonProperty("Sub Tasks") ArrayList<Subtask> SubTasks
            )
    {

        this.Title = Title;
        this.Description = Description;
        this.Created_Date = Created_Date;
        this.Due_Date = Due_Date;
        this.Assignment = Assignment;
        this.Status = Status;
        this.SubTasks = SubTasks;
    }

    public String getTitle() { return Title; };

    public String getDescription() { return Description; };

    public Date getCreated_Date() { return Created_Date; };

    public Date getDue_Date() { return Due_Date; };

    public String getAssignment() { return Assignment; };

    public String getStatus() { return Status; };

    public ArrayList<Subtask> getSubTasks() {
        return SubTasks;
    }
}
