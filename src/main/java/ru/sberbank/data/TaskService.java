package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> list;

    public TaskService(){
        this.list = new ArrayList<>();
    }

    public boolean createTask(int id, String summary){
        if(summary != null && summary.isEmpty() == false){
            Task task = new Task(id, summary);
            list.add(task);
            return true;
        }
        return false;
    }

    public Task getTask(String summary){
        for(Task task: list){
            if(summary.equalsIgnoreCase(task.summary)){
                return task;
            }
        }
        return null;
    }

    public ArrayList getTasksForDeveloping(){
        ArrayList<Task> temp = new ArrayList<>();

        for(Task task: list){
            if(task.isDeveloped == false){
                temp.add(task);
            }
        }
        return temp;
    }
}
