/*
    1. "Hello.java" 문자열에서 파일명은 Hello 와 확장자인 java 를 분리시켜보자.

    입력 >> Hello.java
    출력
    파일명 Hello
    확장자 java

 */

public class Ex08 {

    public static void main(String[] args) {
        String string = "Hello.java";
        String fileSplit1 = string.substring(0,5);
        String fileSplit2 = string.substring(6,10);

        System.out.println("파일명 "+fileSplit1);
        System.out.println("확장자 "+fileSplit2);
    }
}
