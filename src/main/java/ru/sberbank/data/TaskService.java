package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> list;

    public TaskService() {
        this.list = new ArrayList<>();

    }

    public boolean createTask(int id, String summary) {
        if (summary == null && summary.isEmpty()) {
            return false;
        }
        this.list.add(new Task(id, summary));
        return true;
    }

    public Task getTask(String summary) {
        for (Task task : this.list) {
            if (task.summary.equalsIgnoreCase(summary)) {
                return task;
            }
        }
        return null;
    }

    public ArrayList<Task> getTasksForDeveloping() {
        ArrayList<Task> tasksForDeveloping = new ArrayList<>();
        for (Task task : this.list) {
            if (!task.isDeveloped) {
                tasksForDeveloping.add(task);
            }
        }
        return tasksForDeveloping;
    }
}
