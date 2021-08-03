package org.apache.study;

public class InterFace {
    public static void main(String[] args) {
        System.out.println(Math.A);
    }
}
//一个接口可继承多个接口
interface A{

}
interface B extends A {

}
interface C extends B, A{

}
interface Math{
    //public static final可省略
    //public static final double A = 3.14;
    double A = 3.14;
    // 接口抽象方法不能带有主体
    /*void main() {
     }
     */
    //public abstract可省略
    //public abstract int sum(int a, int b);
    int sum(int a, int b);
    int sub(int a, int b);
}
//接口的实现
abstract class MathImpl implements Math{
    //重写或者覆盖接口中的方法成为实现
    //接口中的方法都是public


    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    //  java8中可以可以在接口中定义一个default修饰方法
    //实现了Size接口的类都会自动继承isEmpty的实现
    public interface Sized {

        int size();

        default boolean isEmpty() {
            return size() == 0;
        }
    }
}



