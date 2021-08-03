package org.apache.study;

public class Pri {
    //privat 子类无法访问也无法跨包访问
    private static void main(String[] args) {
        Student s1 = new Student("kali");
        System.out.println(s1.name);
    }

/*
    class Student {
        String name;
    }

    private Student(String s1) {
        name = s1;
    }
    }
 */


    //public修饰的类、属性以及方法可以跨类和跨包使用
    public static void doSome(String[] args) {
        Chinese c1 = new Chinese("李四");
        System.out.println(c1.name);
    }
}

class Chinese {
    String name;

    public Chinese(String c1) {
        name = c1;
    }
}

