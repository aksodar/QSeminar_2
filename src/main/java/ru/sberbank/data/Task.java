package ru.sberbank.data;

public class Task {
    int id;
    boolean isDeveloped;
    boolean isTested;
    String summary;

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
        this.isTested = false;
        this.summary = summary;
    }
}
