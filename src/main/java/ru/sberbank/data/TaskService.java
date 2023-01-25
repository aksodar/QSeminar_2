package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> list;

    public TaskService() {
        this.list = new ArrayList<>();
    }

    public boolean createTask(int id, String summary) {
        if (summary != null && summary.isEmpty() == false) {
            Task newTask = new Task(id,summary);
            list.add(newTask);
            return true;
        }
        return false;
    }

    public Task getTask(String summary) {
        for (Task n: list) {
            if (summary.equalsIgnoreCase(n.summary)) {
                return n;
            }
        }
        return null;
    }

    public ArrayList getTaskForDeveloping() {
        ArrayList<Task> tempList = new ArrayList<>();
        for (Task listElement : list) {
            if (listElement.isDeveloped == false) {
                tempList.add(listElement);
            }
        }
        return tempList;
    }
}
