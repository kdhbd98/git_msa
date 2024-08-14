package org.example.DB;

import java.util.Scanner;

public class DBMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("""
                    Which one will you choose?
                    1. enter
                    2. research
                    3. modify
                    4. delete
                    5. exit
                    """);
            int cho = scanner.nextInt();
            if (cho == 1){

            } else if (cho == 2) {

            }
            else {
                System.out.println("exit.");
                break;
            }
        }
    }
}
