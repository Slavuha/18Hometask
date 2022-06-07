package com.company;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Printer<String> stringPrinterprinter = new Printer<>("Printed test from Main = String");
        // stringPrinterprinter.print();

        Integer[] arr = {1, 2, 7};
        Printer<Integer[]> integerPrinter = new Printer<>(arr);
        integerPrinter.arrToList(arr);
        integerPrinter.getSomething();
        //      integerPrinter.print();
//
        //       System.out.println("Print iz meina "+integerPrinter);

// try from massive to araysList her is working
        List<Integer> arrayList = new ArrayList();
        arrayList = Arrays.asList(arr);
        //      System.out.println("Print from main test 2 "+arrayList);

        Conventer<Integer[]> conventer = new Conventer<>(arr);
        conventer.numericArrayToList(arr);
        conventer.getConvertedList();
        conventer.printList();
    }
}




