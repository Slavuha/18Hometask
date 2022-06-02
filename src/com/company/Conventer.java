package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Conventer<T> {
     public T convertedList;


    public Conventer(T convertedList) {
        this.convertedList = convertedList;
    }
// нужен ли сдесь этот пустой конструктор?
    public Conventer() {

    }


    public void numericArrayToList(){
   //     numericArrayToList позволяет преобразовать любой _числовой_ массив в ArrayList
        //     соответствующего типа и сохранить его в convertedList;
    Integer[] array = new Integer[10] ;
    array[0] = 1;
    array[1] = 1;
    array[2] = 1;
    array[3] = 1;
    array[4] = 1;
    array[5] = 2;
    array[6] = 3;
    array[7] = 5;
    array[8] = 8;
    array[9] = 0;
        System.out.println("Printed array"+Arrays.toString(array));
// Her I must use generics, but how
        T arrayList = (T) new ArrayList<T>((Collection<? extends T>) Arrays.asList(array));

        System.out.println("Change from Array to ArayList"+arrayList);
//Her I must save to convertedList
convertedList = arrayList; //work
        System.out.println("Save from arrayList to convertedList"+ convertedList); // print
    }

    private boolean toString(Integer[] m) {
        return false;
    };


    public void printList(){

        System.out.println("Print from metod"+convertedList);


        //  printList() печатает его в консоль построчно
        }

    public Conventer<T> getList() {
         convertedList = this.convertedList;
        System.out.println("Get " + convertedList);
        return this;
    }
}
//
//        Создать новый класс Converter, содержащий: полe List convertedList; методы numericArrayToList(), getList(), printList().
//        numericArrayToList позволяет преобразовать любой _числовой_ массив в ArrayList соответствующего типа и сохранить его в convertedList;
//        getList(), возвращает созданный List;
//        printList() печатает его в консоль построчно