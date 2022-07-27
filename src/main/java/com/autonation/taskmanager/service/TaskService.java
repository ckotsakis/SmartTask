package com.autonation.taskmanager.service;

import com.autonation.taskmanager.dao.TaskDao;
import com.autonation.taskmanager.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskDao taskDao;

    @Autowired
    public TaskService(@Qualifier("taskDao") TaskDao taskDao) {
        this.taskDao = taskDao;
    }
    public int insertTask(Task task) {
        return taskDao.insertTask(task);
    }
}
