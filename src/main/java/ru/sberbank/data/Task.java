package ru.sberbank.data;

public class Task {
    int id;
    boolean isDeveloped;
    String summary;

    public Task(int id, String summary) {
        this.id = id;
        this.summary = summary;
        this.isDeveloped = false;
    }

    public Task(int id) {
        this.id = id;
        this.isDeveloped = false;
    }
}
