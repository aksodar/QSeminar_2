package ru.sberbank.data;

public class Task {
    int id;
    boolean isDeveloped;
    String summary;
    boolean isTested;


    @Override
    public String toString() {
        return "Task{" +
               "id=" + id +
               ", isDeveloped=" + isDeveloped +
               ", summary='" + summary + '\'' +
               '}';
    }

    public Task(int id, String summary) {
        this.id = id;
        this.isDeveloped = false;
        this.summary = summary;
    }
    public Task (int id, boolean isDeveloped, boolean isTested) {
        this.id = id;
        this.isDeveloped = isDeveloped;
        this.isTested = isTested;
    }
}
