package com.company;

import java.util.ArrayList;
import java.util.List;

public class HistoryBase {

    List <Operation> operations = new ArrayList<>();

    public void addOperation(Operation e){
        operations.add(e);
    }

    public List<Operation> getAll () {
        return operations;
    }
}
