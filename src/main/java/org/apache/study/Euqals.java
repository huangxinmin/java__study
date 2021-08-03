package org.apache.study;

public class Euqals {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");

        System.out.println(a == b);

        String aa = "ab";
        String bb = "ab";
        //操作符两端是同意对象
        if (aa == bb) {
            System.out.println("aa == bb");
        }
        //操作符两端不是同一对象
        if (a == b) {
            System.out.println("a == b");
        }
        //操作符两端对象的内容相等
        if (a.equals(b)) {
            System.out.println("a Equals b");
        }
    }


}
