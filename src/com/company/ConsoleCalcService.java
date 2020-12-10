package com.company;

import java.util.List;

public class ConsoleCalcService {

    boolean exit = true;
    ConsoleReader r = new ConsoleReader();
    ConsoleWriter w = new ConsoleWriter();
    HistoryBase historyBase = new HistoryBase();
    Operation operation;

    public void printHistory(){
        List<Operation> all = historyBase.getAll();
        for (Operation operation : all) {
            w.writeString(operation.toString());
        }
    }

    public void run(){
        while (exit){

            double a = getNumber("Введите значение a");

            double b = getNumber("Введите значение b");

            w.writeString("ВВедите тип выполняемой операции: mult, dif, sub, sum");
            String type = r.readerString();

            double result = calc(a, b, type);
            w.writeString("Result = " + result);

            double aa = getNumber("Вывести историю? 1 - да, 2 - нет");
            if (aa == 1){
                printHistory();
            }

            double e = getNumber("Не хотите выйти: 1- да, 2- нет?");
            if (e ==1){
                exit = false;
            }

        }

    }

    private double getNumber(String s) {
        w.writeString(s);
        return r.readerDouble();
    }

    public double calc(double a, double b, String type) {
        double result = 0;
        switch (type) {
            case ("mult"):
                result = a * b;
                break;

            case ("dif"):
                result = a / b;
                break;

            case ("sum"):
                result = a + b;
                break;

            case ("sub"):
                result = a - b;
                break;


        }
        historyBase.addOperation(new Operation(a, b, type, result));
        return result;
    }


}
