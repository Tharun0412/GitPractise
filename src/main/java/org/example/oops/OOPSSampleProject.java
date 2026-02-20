package org.example.oops;

import java.util.ArrayList;
import java.util.LinkedList;

public class OOPSSampleProject {


    OOPSSampleProject(int i){
//    this();
        System.out.println("Constructor initialised using 10");
    }

    public OOPSSampleProject(){
        this(10);
        System.out.println("Constructor initialised");

    }

    public void methodOne(Parent a) {
        System.out.println("Parent version");
    }

    public void methodOne(Child m) {
        System.out.println("Child version");
    }

    public void methodOne(String s) {
        System.out.println("String version");
    }
    public void methodOne(StringBuffer s) {
        System.out.println("StringBuffer version");
    }

    public void methodOne(int...i) {
        System.out.println("var-arg method");
    }
    static int count=0;
    {
        count++;
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        System.out.println("Started");
        OOPSSampleProject t=new OOPSSampleProject();
        System.out.println("object creation is done");
        t.methodOne("arun");//String version
        t.methodOne(new StringBuffer("sai"));//StringBuffer version
        t.methodOne(10,5,6);
//        t.methodOne(null);//CE : reference to m1() is ambiquous


        Parent a=new Parent();
        t.methodOne(a);//Animal version
        Child m=new Child();
        t.methodOne(m);//Monkey version
        Parent a1=new Child();
        t.methodOne(a1);//Animal version


        System.out.println("Started");
        OOPSSampleProject t1=new OOPSSampleProject();
        System.out.println("object creation is done");

        System.out.println(count);
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        Long startTime,endTime,elapsedTime;
//        for(int i=0 ;i< 1000000; i++){
//            linkedList.add(i);
//            arrayList.add(i);
//        }
//
//        startTime =System.nanoTime();
//        linkedList.add(5,666666666);
//        endTime = System.nanoTime();
//        System.out.println((endTime - startTime));
//
//
//        startTime =System.nanoTime();
//        arrayList.add(5,666666666);
//        endTime = System.nanoTime();
//        System.out.println((endTime - startTime));

    }


}
