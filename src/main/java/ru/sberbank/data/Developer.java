package ru.sberbank.data;

import java.util.Objects;

public class Developer {
    Task currentTask;
    int id;
    boolean isFree;
    String firstName;
    String secondNname;

    public Developer(int id) {
        this.id = id;
        this.isFree = true;
    }

    public Developer(int id, String firstName, String secondNname) {
        this.id = id;
        this.isFree = true;
        this.firstName = firstName;
        this.secondNname = secondNname;
    }


    public boolean equals2(Developer developer) {
        return this.id == developer.id && this.firstName.equalsIgnoreCase(developer.firstName)
                && this.secondNname.equalsIgnoreCase(developer.secondNname);
    }

    public boolean addTask(Task task) {
        if (this.isFree && this.currentTask == null) {
            this.currentTask = task;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task makeTask() {
        if (this.currentTask != null && !this.isFree) {
            this.currentTask.isDeveloped = true;
            this.isFree = true;
        }
        return currentTask;
    }

    void release() {
        this.currentTask = null;
        this.isFree = true;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "currentTask=" + currentTask +
                ", id=" + id +
                ", isFree=" + isFree +
                ", firstName='" + firstName + '\'' +
                ", secondNname='" + secondNname + '\'' +
                '}';
    }
}
