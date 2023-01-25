package ru.sberbank.data;

public class Task {
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", isDeveloped=" + isDeveloped +
                ", isTested=" + isTested +
                ", summary='" + summary + '\'' +
                '}';
    }

    int id;
    boolean isDeveloped;
    boolean isTested;
    String summary;

    public Task(int id, String summary) {
        this.id = id;
        this.isDeveloped = false;
        this.summary = summary;
    }
}

