package aa;

public class CirCle {
    public static final double PI = 3.1415;
    public static int a = 10;
    public void doRound(){
        System.out.println(2*PI*a);
    }
    public void doArea(){
        System.out.println(a*a*PI);
    }

    // static 을 붙이게 되면 메모리 낭비
    public int doA() {
        int sum = 0;
        int aa = 10;
        int bb = 20;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        return sum;
    }
}
