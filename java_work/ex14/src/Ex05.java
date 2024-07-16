import aa.CirCle;

/*
   public static String dbUrl = ""
   변하지 않고 변수
   모든 클래스에서 참조하고 싶을 때
   클래스 구조 설계 후 사용
 */
public class Ex05 {
    public static void main(String[] args) {
        System.out.println(CirCle.PI);
        System.out.println(CirCle.a);

        CirCle c = new CirCle();
        c.doRound();
        c.doArea();
        int result = c.doA();
        System.out.println(result);
    }
}
