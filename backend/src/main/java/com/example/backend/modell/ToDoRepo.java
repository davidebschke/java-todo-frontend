package com.example.backend.modell;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Repository
public class ToDoRepo {

    private final Map<Integer,Tasks> tasks = Map.of( 1, new Tasks("1", "Arbeiten"),
            2, new Tasks("2", "Zeitung lesen"),
            3, new Tasks("3", "Wäsche waschen"),
            4, new Tasks("4", "Bootcamp Unterricht"));



    public List<Tasks> listTasks() {
        return new ArrayList<>(tasks.values());
    }

/*


    public String getAlltasks(){


        return tasks.toString();

    }*/



}
