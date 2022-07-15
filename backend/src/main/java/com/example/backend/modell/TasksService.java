package com.example.backend.modell;


import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TasksService {

    private final ToDoRepo toDoRepo;

    public TasksService(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public List<Tasks> listTasks() {
        return toDoRepo.listTasks();
    }


}
