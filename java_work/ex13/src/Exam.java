import java.util.Scanner;

class Exam {
    Scanner scanner = new Scanner(System.in);

    public int inputNumber() {
        System.out.println("숫자 입력");
        int inputNumber = scanner.nextInt();
        System.out.println("inputNumber().inputnumber = " + inputNumber);
        return inputNumber;
    }
}
