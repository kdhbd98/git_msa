/*
  3. 필자가 좋아하는 것 중 하나가 금요일 저녁 퇴근길에 DVD나 만화책을 잔뜩 빌리고,
    동네 슈퍼에 들러서 군것질거리를 사 가지고 집에 들어가는 것이다.
    오늘은 금요일이다. 현재 필자의 주머니에는 5천 원이 있다.
    DVD 한 편을 빌리면 3,500원이 남는다. => DVD 하나에 1,500원
    슈퍼에 들려서 크림빵(500원), 새우깡(700원), 콜라(400원)를 사려한다.
    잔돈을 하나도 남기지 않고 이 세 가지 물건을 하나 이상 반드시 구매하려면
    어떻게 구매를 진행해야 하겠는가? 물론 여기에는 여러 가지 경우의 수가 있을 것이다.

    ctrl + shift + l 문자 검색
    ctrl + d 문장 통째로 복사 및 붙여넣기
 */
public class Ex08 {
    public static void main(String[] args) {
        int DVD = 1500;
        int bread = 500;
        int shrimp = 700;
        int coke = 400;
        int sum = 5000;
        int d;
        int b;
        int s;
        int c;
        int rest;
        rest = DVD * d + bread * b + shrimp * s + coke * c;
        for (int d = 1; d < rest; d++) {

        }
        for (int d = 2; d < rest ; d++) {

        }

        if (rest == 1900) {
            System.out.println("DVD = ");
            System.out.println("크림빵 = ");
            System.out.println("새우깡 = ");
            System.out.println("콜라 = ");
        }
    int count1 = 0;
        int count2 = 0;

        for (int d = 1; d <= sum; d++) {
            for (int b = 0; b < sum - (d * DVD) / bread; b++) {
                for (int s = 0; s < sum - (d * DVD - b * bread) / shrimp; s++) {
                    for (int c = 0; c < sum - (d * DVD - b * bread - s * shrimp) / coke; c++) {
                        if (d * DVD + b * bread + s * shrimp + c * coke == sum) {
                            count1++;
                            System.out.println("조합: " + "DVD " + d + "개 " + "크림빵 " + b + "개 " + "새우깡 " + s + "개 " + "콜라 " + c + "개");
                        }
                    }
                }
            }
        }
        for (int d = 2; d <= sum; d++) {
            for (int b = 0; b < sum - (d * DVD) / bread; b++) {
                for (int s = 0; s < sum - (d * DVD - b * bread) / shrimp; s++) {
                    for (int c = 0; c < sum - (d * DVD - b * bread - s * shrimp) / coke; c++) {
                        if (d * DVD + b * bread + s * shrimp + c * coke == sum) {
                            count2++;
                            System.out.println("조합: " + "DVD " + d + "개 " + "크림빵 " + b + "개 " + "새우깡 " + s + "개 " + "콜라 " + c + "개");
                            break;
                        }
                    }
                }
            }
        }
    }
}
