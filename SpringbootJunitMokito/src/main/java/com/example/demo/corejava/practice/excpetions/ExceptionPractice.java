package com.example.demo.corejava.practice.excpetions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPractice {
    public static void main(String[] args) {
        Base b=new Derived();
        try {
            b.print();
        }catch (IOException e){
            System.out.print("AWE");
        }finally {
            System.out.print("SOME");
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