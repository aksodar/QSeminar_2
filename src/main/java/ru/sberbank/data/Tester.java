package ru.sberbank.data;


public class Tester {
    int id;
    Task currentTask;
    boolean isFree;
    String firstName;
    String secondName;

    public Tester(int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

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

    public Tester (int id, String firstName, String secondName) {
        this.id = id;
        this.isFree = true;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public boolean addTask(Task test) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = test;
            this.isFree = false;
            return true;
        } return false;
    }

    public Task checkTask() {
        if (this.currentTask != null) {
            this.currentTask.isTested = true;
            this.isFree = false;
        } return currentTask;
    }

    public void release() {
        this.isFree = true;
        this.currentTask = null;
    }
}
