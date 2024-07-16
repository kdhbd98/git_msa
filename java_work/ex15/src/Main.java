import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello.java";
        String temp[] = str.split("\\."); // . 을 기준으로 앞 뒤 구분

        System.out.println(temp[0]);
        System.out.println(temp[1]);

        str = "Hello.java";
        temp = str.split("[A-Z]"); // 대문자, 소문자로 구분

        System.out.println(Arrays.toString(temp));

        str = "아1빨리2집에3가고싶다";
        temp = str.split("\\d");

        System.out.println(Arrays.toString(temp));

        str = "아1빨리2집에3가고싶다";
        temp = str.split("\\D");

        System.out.println(Arrays.toString(temp));

        if (temp[0].equals("exe"))
            return; // 확장자 파일 업로드 방지용
    }
}