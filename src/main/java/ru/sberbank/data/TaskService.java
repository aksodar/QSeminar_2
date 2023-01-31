package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> tasks;

    public TaskService() {
        this.tasks = new ArrayList<>();
    }

    public boolean createTask(int id, String summary) {
        if (summary != null && !summary.isEmpty()) {
            Task newTask = new Task(id, summary);
            tasks.add(newTask);
            return true;
        }
        return false;
    }

    public Task getTask(String summary) {
        for (Task s: tasks) {
            if (summary.equalsIgnoreCase(s.summary)) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Task> getTasksForDeveloping() {
        ArrayList<Task> temp = new ArrayList<>();
        for (Task s: tasks) {
            if (s.isDeveloped == false) {
                temp.add(s);
            }
        }
        return temp;
    }
}