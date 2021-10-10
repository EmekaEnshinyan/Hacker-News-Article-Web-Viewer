package com.example.demo.dataaccessobject;

import com.example.demo.model.Article;

import java.util.UUID;
//interface is outline for a class
//every method needs to be implemented
interface Practice {
    //attributes for outline
    String color = "blue";
    void fillUp();
    void empty();
}
//this allows use of all methods and attributes of interface
public class InterfaceTest implements Practice {

    public static void main(String[] args) {
        System.out.println(color);
        InterfaceTest example = new InterfaceTest();
        example.fillUp();
    }
        @Override
        public void fillUp() {

        }
        @Override
        public void empty(){

        }
    }

