// void : 값을 변환하지 않음을 의미
// return : 값의 반환을 명령

public class BB {
    public static String doA() {
        int a = 10;
        System.out.println("doA");
        System.out.println("a = " + a);
        return "a의 값은 a" + a;
    }

    public static void main(String[] args) {
        String a = doA();
        System.out.println("main a = " + a);
    }
}
