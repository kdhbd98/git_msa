public class Ex05 {
    public static void main(String[] args) {

        String str = "안녕하세요 권도희 입니다.";
        String[] tempstr = str.split(" ");

        for (int i = 0; i < tempstr.length; i++) {
            System.out.println(tempstr[i]);
        }

        String a = "abcdegfh";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));

        System.out.println(a.substring(2));
        System.out.println(a.substring(2, 5));
        System.out.println(a.toUpperCase());
        System.out.println("cd를 포함하나 = " + a.contains("cd"));

        System.out.println("배열출력 시작");
        char[] test = "테스트".toCharArray();
        for (int i = 0; i < test.length; i++) {
            System.out.println("test{"+i+"]"+test[i]);
//            System.out.printf("test[%s]="+test[i]);
        }
        System.out.println("배열출력 끝");

        test[2] = 'A';
        char xyz[] = {'A','B','C'};
        // 하나의 문자열로 바꾸고 싶을 때 -> String c = "ABC"
        String testStr = new String(test);
        System.out.println(xyz[0]);
        System.out.println(xyz[1]);
        System.out.println(xyz[2]);

        int[] b = new int[3];
        System.out.println(b.length);
    }
}
