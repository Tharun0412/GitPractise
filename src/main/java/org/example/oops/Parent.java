package org.example.oops;


import lombok.Data;

@Data
public class Parent {
    private void methodOne(){
        System.out.println("PARENT method is called");
    }
}
