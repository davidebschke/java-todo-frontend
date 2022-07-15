package com.example.backend;

import com.example.backend.modell.TasksService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

private final TasksService tasksService;

    public Controller(TasksService tasksService) {
        this.tasksService = tasksService;
    }


    @GetMapping("/todo")

    public void toDo(){

        tasksService.listTasks();



    }

   @GetMapping("/doing")

   public String doing (String id,String taskName){

       return (id+taskName);



   }






   @GetMapping("/done")

    public String done (String id,String taskName){

        return (id+taskName);



    }







}
