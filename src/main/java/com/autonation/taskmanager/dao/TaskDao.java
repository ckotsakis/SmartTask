package com.autonation.taskmanager.dao;

import com.autonation.taskmanager.model.Task;

public interface TaskDao {

    int insertTask(Task task);
    String getTask(String Title);
    
}
