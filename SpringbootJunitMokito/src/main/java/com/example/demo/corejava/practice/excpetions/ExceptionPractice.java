package com.example.demo.corejava.practice.excpetions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ExceptionPractice {
    public static void main(String[] args) {
        Base b=new Derived();
//        try {
//            b.print();
            ArrayList<String> listOfStrings = new ArrayList<>();
            listOfStrings.add("A");listOfStrings.add("E");listOfStrings.add("I");listOfStrings.add("O");listOfStrings.add("U");
            listOfStrings.addAll(listOfStrings.subList(0,4));
            listOfStrings.forEach(System.out::print);
//        }catch (IOException e){
//            System.out.print("AWE");
//        }finally {
//            System.out.print("SOME");
//        }
        Buyable []arr=new Buyable[5];
        for (Buyable buy:arr) {
            System.out.println("Buyable object:- "+buy.salePercentage);
            System.out.println("Buyable object:- "+buy.salePercentage);
        }

        Book[] booksArray=new Book[2];
        for (Book book:booksArray) {
            System.out.println("Book object:- "+book.salePercentage);
            System.out.println("Book object:- "+book.salePercentage);
        }
    }
}

abstract class Base{
    public abstract void print() throws IOException;
}

class Derived extends Base {

    @Override
    public void print() throws IOException {
        throw new FileNotFoundException();
    }
}