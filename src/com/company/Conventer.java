package com.company;
import java.util.ArrayList;
import java.util.List;

public class Conventer <T> {
    private List<T> convertedList;

    public void setArrayToList(T[] inputArray) {
        List<T[]> arr = new ArrayList(List.of(inputArray));
        convertedList = (List<T>) arr;
       // System.out.println("Print from metod setArratToList " +convertedList);

        }


    public void printList() {

        System.out.println("Print from Class Conventer metod" + convertedList);
        }

    public List<T> getConvertedList() {
        return convertedList;
    }


}
//}
//
//        Создать новый класс Converter, содержащий: полe List convertedList; методы numericArrayToList(), getList(), printList().
//        numericArrayToList позволяет преобразовать любой _числовой_ массив в ArrayList соответствующего типа и сохранить его в convertedList;
//        getList(), возвращает созданный List;
//        printList() печатает его в консоль построчно