// shift + f10 현재 설정된 파일 실행
// ctrl + shift + f10 열려진 파일 실행
// ctrl + alt + L 자동 정렬
// shift + enter 다음 줄 바로 가기
// shift + delete 한 줄 지우기
// alt + 1 프로젝트 경로 바로 보기
// esc 소스로 바로 접속
// alt + insert 파일 만들기
// ctrl+ e 최근 파일 찾기
// shift + shift 파일 찾기
// ctrl + f4 창 닫기
// shift + f6 이름 변경
// alt + enter 빠른 오류 수정

public class Main {
    public static void main(String[] args) {
        /*
            1+(1+2)+(1+2+3)+...+(1+2+3+4+...+10)
            의 결과를 계산하시오.
            i = 0 일때 j가 0에서 0+1미만 반복하라
            i = 1 일때 j가 0에서 1+1미만 반복하라
            i = 2 일때 j가 0에서 2+1미만 반복하라
            i = 3 일때 j가 0에서 3+1미만 반복하라
            i = 4 일때 j가 0에서 4+1미만 반복하라
            ...
            i = 10 일때 j가 0에서 10+1미만 반복하라

         */
        int sum = 0;

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.println("j = "+j);
                sum = sum + j;
            }
            System.out.println("sum = "+sum);
        }
        System.out.println("sum = "+sum);
    }
}