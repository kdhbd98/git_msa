package org.example;

public class Ex04 {
    public static <T> Box makeBox(T t) {
        Box<T> box = new Box<>();
        box.setObj(t);
        return box;
    }

    public static void main(String[] args) {
        Box<String> box1 = /* Ex04.<String> => 생략가능*/makeBox("test");
        Box<Integer> box2 = makeBox(20);

        System.out.println(box1);
        System.out.println(box2);
    }
}
