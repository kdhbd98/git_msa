package org.example;

public class Ex04 {
    public static void main(String[] args) {
        /*
           throws 예외 전달
           throw 예외 생성
         */
        try {
            throw new MyException(
                    new ErrorCode(
                            "Insert ID",
                            "A101",
                            "Use English if you insert your ID"));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
