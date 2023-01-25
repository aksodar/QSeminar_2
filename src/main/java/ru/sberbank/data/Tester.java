package ru.sberbank.data;

import java.util.Objects;
public class Tester {
    int id;
    Task currentTask;
    boolean isFree;
    String firstName;
    String secondName;

    @Override
    public String toString() {
        return "Tester{" +
               "id=" + id +
               ", currentTask=" + currentTask +
               ", isFree=" + isFree +
               ", firstName='" + firstName + '\'' +
               ", secondName='" + secondName + '\'' +
               '}';
    }

    public Tester (int id, boolean isFree){
        this.id = id;
        this.isFree = isFree;
    }

    public Tester (int id){
        this.id = id;
        this.isFree = true;

    }

    public Tester (int id, String firstName, String secondName){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public boolean addTask(Task y){
        if(this.isFree == true && this.currentTask == null){
            this.currentTask = y;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task checkTask(){
        if(this.currentTask != null && this.currentTask.isDeveloped == true && this.currentTask.isTested == false){
            this.currentTask.isTested = true;
        }
        return currentTask;
    }

    public void release(){
        this.currentTask = null;
        this.isFree = true;
    }
}
