package org.example;

class MyBox<T extends Number>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        MyBox<Integer> myBox1 = new MyBox<>();
//      MyBox<String> myBox1 = new MyBox<>();
//      => 위에서 extends Number 입력했으므로 숫자만 입력 가능
    }
}
