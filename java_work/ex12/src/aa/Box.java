package aa;

// 클래스 정의
public class Box {
    String name;
    int count;

    /*
       기본생성자는 생략 가능 but
       다른 생성자를 선언할 시 기본생성자 생략 불가

       접근제어 지시자(public protected default private)
     */
    public Box() {
        System.out.println("기본 생성자 호출");
    }

    public Box(String n) {
        name = n;
        System.out.println("n 다른 생성자 호출");
    }

    public Box(String n, int c) {
        name = n;
        count = c;
        System.out.println("n c 다른 생성자 호출");
    }

    // 기본적으로 toString()은 생략됨
    // toString() 주소값 출력
    // 프로그래머가 직접 적게 되면 내용이 변화함
    public String toString() {
        return "Box name = " + name + "count = " + count;
    }

    // 메서드 이름이 동일할 수 없다.
    public void doA() {
    }

    public void doA(String A) {
    }
}
