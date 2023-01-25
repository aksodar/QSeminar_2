package ru.sberbank.data;

import java.util.Objects;

public class Developer {
    Task currentTask;
    int id;
    boolean isFree;
    String firstName;
    String secondName;

    public Developer(int id) {
        this.id = id;
        this.isFree = true;
    }

    public Developer(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public boolean equals2 (Developer x) {
        if (this.id == x.id && this.firstName.equalsIgnoreCase(x.firstName) && this.secondName.equalsIgnoreCase(x.secondName)) {
            return true;
        }
        return false;
    }

    boolean addTask(Task task){
        if(this.isFree && this.currentTask == null){
            this.currentTask = task;
            this.isFree = false;
            return true;
        }
        return false;
    }

    Task makeTask(){
        if(this.currentTask != null && this.isFree == false){
            this.currentTask.isDeveloped = true;
            this.isFree = true;
        }
        return null;
    }

    void release(){
        this.currentTask = null;
        this.isFree = true;
    }
}
