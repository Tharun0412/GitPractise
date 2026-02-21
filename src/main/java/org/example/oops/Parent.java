package org.example.oops;


import lombok.Data;

@Data
public class Parent {

//    Parent(int i){
//        System.out.println("Parent call constructor");
//    }
    private void methodOne(){
        System.out.println("PARENT method is called");
    }

    public static void main(String[] args){
        throw new RuntimeException();
    }
}
