class B {
    /*
       toString 생략된 상태
       개발자가 임의적으로 적게 되면 적은 내용 실행
       생성자도 생략 가능

       생략된 문법 1 (생성자)
       public B(){
           System.out.println("생성자");
       }
       생략된 문법 2
       public String toString() {
           return super.toString();
       }
    */

    int a = 10;

    public B() {
        System.out.println("생성자");
        a = 20;
    }

}

public class Ex02 {
    public static void main(String[] args) {
        /*
           생성자는 함수랑 비슷한 모양이지만
           변환값을 적지 않는다.
         */
        B b = new B();
        System.out.println(b.a);
    }
}
