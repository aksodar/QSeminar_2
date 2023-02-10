package ru.sberbank.data;

public class Task {
    int id;
    boolean isDeveloped;
    String summary;
    boolean isTested;

    public Task(int id) {
        this.id = id;
        this.isDeveloped = false;
    }

    public Task(int id, String summary) {
        this.id = id;
        this.isDeveloped = false;
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", isDeveloped=" + isDeveloped +
                ", summary='" + summary + '\'' +
                ", isTested=" + isTested +
                '}';
    }
}
