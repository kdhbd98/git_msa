import java.lang.System; /* => 생략된 상태. 적지 않아도 무방 */
// ctrl + . -> 명령문 줄이기
class Test {
    public static void doA() {
        System.out.println("static doA");
    }

    public void doB() {
        System.out.println("instance doB");
    }
}

public class Ex06 {
    int num = 0;

    static void Add(int n) {
//  static 구문에서 non-static 에 해당하는 변수를 선언할 수 없다
//        num += n;
    }

    public static void main(String[] args) {
        Test.doA();
        Test test = new Test();
        test.doB();
    }
}
