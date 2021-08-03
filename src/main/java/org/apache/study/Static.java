package org.apache.study;

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("kali");
        System.out.println(s1.name);

    }
}
    class Student {
        String name;
        // 静态变量
        static String ID = "1";


    public Student() {
    }
    public Student(String s1) {
        name = s1;
    }

}
