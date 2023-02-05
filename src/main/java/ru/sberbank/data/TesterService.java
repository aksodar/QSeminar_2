package ru.sberbank.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesterService {
    private List<Tester> list;

    public TesterService() {
        this.list = new ArrayList<>();
    }

    public boolean createTester(int id, String name, String secondName) {
        if (name != null && !name.isEmpty() && secondName != null && !secondName.isEmpty()) {
            list.add(new Tester(id, name, secondName));
            return true;
        }
        return false;
    }

    public Tester getTester(String name, String secondName) {
        return list.stream()
                   .filter(
                           tester -> tester.getFirstName().equals(name) && tester.getSecondName().equals(secondName)
                   )
                   .findFirst().orElse(null);
    }

    public List<Tester> getFreeTesters() {
        return list
                .stream()
                .filter(Tester::isFree)
                .collect(Collectors.toList());
    }
}
