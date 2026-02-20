package org.example.oops;

import java.util.ArrayList;
import java.util.LinkedList;

public class OOPSSampleProject {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Long startTime,endTime,elapsedTime;
        for(int i=0 ;i< 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        startTime =System.nanoTime();
        linkedList.add(5,666666666);
        endTime = System.nanoTime();
        System.out.println((endTime - startTime));


        startTime =System.nanoTime();
        arrayList.add(5,666666666);
        endTime = System.nanoTime();
        System.out.println((endTime - startTime));

    }
}
