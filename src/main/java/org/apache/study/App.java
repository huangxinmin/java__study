package org.apache.study;


public class App {

    public static void main(String[] args) {

        int x = 10 ;
        add(x) ;
        System.out.println(x);

        Sample s = new Sample();
        s.a = 2 ;
        add(s);
        System.out.println(s.a) ;
    }

    public static void add(int x ){
        x = x+3 ;
    }

    public static void add(Sample a){
        a.a = a.a + 100 ;
    }

    public static class Sample{
        int a ;
    }
}
