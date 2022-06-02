package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

   Conventer<Double> conventer = new Conventer(7.2);
       // ArrayList<Double> arrayList = new ArrayList<>();
       // arrayList.add(22.44);
      //  System.out.println(arrayList);
   conventer.numericArrayToList();
   conventer.getList();
   conventer.printList();
    }
}

