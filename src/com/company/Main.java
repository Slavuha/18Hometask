package com.company;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] arrDimin = {1, 23, 43, 123, -213};

        Conventer<Integer> converterInt = new Conventer<>();
        converterInt.setArrayToList(arrDimin);

        List<Integer> intResultList = converterInt.getConvertedList();
        System.out.println("Print intResult " + intResultList);
        converterInt.printList();
    }
}




