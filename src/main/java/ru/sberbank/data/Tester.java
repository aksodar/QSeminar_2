package ru.sberbank.data;

public class Tester {
    int id;
    Task currentTask;
    boolean isFree;
    String firstName;
    String secondName;

    public Tester(int id) {
        this.id = id;
        this.isFree = true;
    }

    public Tester(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public boolean addTask(Task t) {
        if(this.isFree && this.currentTask == null) {
            this.currentTask = t;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task makeTask() {
        if (this.currentTask != null) {
            this.currentTask.isDeveloped = true;
        }
        return this.currentTask;
    }

    public void release() {
        this.currentTask = null;
        this.isFree = true;
    }
}
