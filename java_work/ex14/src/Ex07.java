import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.lang.Math.PI;

class AA {
    public static BB bb = new BB();
}

class BB {
    public void doA() {
        System.out.println("BB doA");
    }
}

public class Ex07 {
    public static void main(String[] args) {
        AA.bb.doA();
        System.out.println(PI);

//      window 의 날짜, 시간 설정을 들고 오는 방식
//      그러므로 window 에서 임의로 설정을 바꾸면 값이 바뀐다
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}
