package ru.sberbank.data;

public class Tester {
    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", currentTask=" + currentTask +
                ", isFree=" + isFree +
                '}';
    }

    int id;
    String firstName;
    String secondName;
    Task currentTask;
    boolean isFree;

    public Tester (int id, boolean isFree,String firstName, String secondName, Task currentTask){
        this.id = id;
        this.isFree = isFree;
        this.firstName = firstName;
        this.secondName = secondName;
        this.currentTask = currentTask;
    }

    public Tester (int id){
        this.id = id;
        this.isFree = true;
    }
    public Tester (int id, String firstName, String secondName) {
        this.id = id;
        this.isFree = true;
        this.firstName = firstName;
        this.secondName = secondName;
        this.currentTask = null;
    }


    public boolean addTask(Task a) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = a;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public boolean checkTask() {
        if (this.currentTask != null) {
            this.currentTask.isTested = true;
            return true;
        }
        return false;
    }

    public void release(){
        this.currentTask = null;
        this.isFree = true;
    }
}