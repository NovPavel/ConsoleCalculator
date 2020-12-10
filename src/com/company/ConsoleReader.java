package com.company;

import java.util.Scanner;

public class ConsoleReader {


    Scanner sc = new Scanner(System.in);

    public double readerDouble (){
        return sc.nextDouble();
    }

    public String readerString (){
        return sc.next();
    }
}
