package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Printer<T> {

   public T something;

    public Printer(T something){

        this.something = something;
    }

    public T getSomething() {
        return something;
    }

    public void print (){
        System.out.println("Print from print class Printer  "+(something));


    }

    public List<T> arrToList(T something) {
        List<T> arr = new ArrayList<>();
        arr = Arrays.asList(something);
       // System.out.println("Print iz metoda v klase Print" +(arr));
        return arr;

    }
}
