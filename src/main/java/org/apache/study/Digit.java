package org.apache.study;

public class Digit {

    public int add(int a,int b){
        return a+b ;
    }

    public static void main(String[] args) {

        Digit digit = new Digit() ;
        int r = digit.add(1,2) ;

        System.out.println(r);
    }
}
