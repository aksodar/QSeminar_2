package ru.sberbank.data;

import java.util.Objects;

public class Developer {
    private int id;
    private boolean isFree;
    private Task currentTask;

    public Developer (int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public Developer (int id) {
        this.id = id;
        this.isFree = true;
    }

    public int getId() {
        return id;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(final boolean free) {
        isFree = free;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(final Task currentTask) {
        this.currentTask = currentTask;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public boolean addTask(Task t) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = t;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task makeTask() {
        if (this.currentTask != null) {
            this.currentTask.setDeveloped(true);
        }
        return currentTask;
    }

    public void release() {
        this.currentTask = null;
        this.isFree = true;
    }
}