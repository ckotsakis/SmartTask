package com.autonation.taskmanager.api;

import com.autonation.taskmanager.model.Task;
import com.autonation.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/task")
@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {this.taskService = taskService;}

    @PostMapping
    public void insertTask(@RequestBody Task task) {taskService.insertTask(task);}

}
