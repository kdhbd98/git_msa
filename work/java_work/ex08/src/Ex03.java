public class Ex03 {
    public static void doA(int a) {
        System.out.println("a = " + a);
    }

    public static void doB(int b) {
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        doA(10);
        doB(20);

        int num1 = 10;
        int num2 = 20;

        if (num1 == 10) {
            num2 = 20;
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // for 구문 : 반복
        for (int i = 0; i < 3; i++) {
            int a = 20;
            System.out.println(a);
        }
    }
}
