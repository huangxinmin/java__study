package org.apache.study;

public class Final {
    class A {
        public void doSome() {
            System.out.println("speedup");
        }
    }
    class B extends A {
        public void main() {
            System.out.println("speedup");
        }
    }
    class C {
        public final void main() {
            System.out.println("speed");
        }
    }
    /*
    class D extends C {
        public void main() {
            System.out.println("speed");
        }
    }
    */
}

