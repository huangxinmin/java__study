package org.apache.study;

public class Father {

    public static void main(String[] args) {
        Son s = new Son();
        s.sayHello();
    }
    public void sayHello() {
        System.out.println("Hello");
    }
}
class Son extends Father {
    @Override
    // 重写 子类继承父类原有方法，可以修改方法体或重写
    public void sayHello() {
        System.out.println("Goodbye");
    }
}
