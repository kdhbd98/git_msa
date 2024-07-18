// ctrl shift f10 현재 열린 파일 실행

public class AA {
    public static void main(String[] args) {

        // break => while for switch 빠져 나오기

        int sum = 0;
        for (int i = 0; ; i++) {
            System.out.println("i= " + i);
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
            System.out.println("중간 sum = " + sum);
            if (sum >= 100)
                break;
        }
        System.out.println(sum);
    }
}
// continue => 제어문 조건을 이미 충족했어도, 남은 단계까지 전부 진행
// break => 제어문 조건 충족 시 즉시 중지