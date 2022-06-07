package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conventer <T> {
    public T convertedList;
    public Conventer(T convertedList) {
        this.convertedList = convertedList;
    }

    public List<T> numericArrayToList(T convertedList) {
        List<T> arr = new ArrayList();
        arr.add(convertedList);
        arr = Arrays.asList(convertedList);
        return arr;
        }

    public T getConvertedList() {
        return convertedList;
    }

    public void printList() {
            System.out.println("Print from Class Conventer metod" + Arrays.toString((Object[]) convertedList));
        }



}
//}
//
//        Создать новый класс Converter, содержащий: полe List convertedList; методы numericArrayToList(), getList(), printList().
//        numericArrayToList позволяет преобразовать любой _числовой_ массив в ArrayList соответствующего типа и сохранить его в convertedList;
//        getList(), возвращает созданный List;
//        printList() печатает его в консоль построчно