package com.autonation.taskmanager.dao;


import com.autonation.taskmanager.model.Subtask;
import com.mongodb.client.*;
import com.autonation.taskmanager.model.Task;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("taskDao")
public class TaskAccesService implements TaskDao {

    @Override
    public int insertTask(Task task) {

        ArrayList<Subtask> subtasks = task.getSubTasks();
        System.out.println(subtasks.get(0).getTitle());
        System.out.println(task.getDue_Date());
        return 1;
    }

    @Override
    public String getTask(String title) {
        return "Test Task";
    }

}
