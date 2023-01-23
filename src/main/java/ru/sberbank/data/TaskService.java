package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> list;

    public TaskService() {
        this.list = new ArrayList<>();
    }

    public boolean createTask(int j, String s) {
        if(s != null && !s.isEmpty()) {
            list.add(new Task(j, s));
            return true;
        }
        return false;
    }

    public Task getTask(String sum) {
        for(Task tsk: list)
            if(sum.equalsIgnoreCase(tsk.summary))
                return tsk;

        return null;
    }

    public ArrayList getTasksForDeveloping() {
        ArrayList<Task> tmp = new ArrayList<>();

        for(Task item: list)
            if(!item.isDeveloped)
                tmp.add(item);

        return tmp;
    }
}
