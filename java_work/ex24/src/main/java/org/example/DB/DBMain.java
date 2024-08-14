package org.example.DB;

import java.util.Scanner;

public class DBMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBRepository dbRepository = new DBRepository();
        while (true){
            System.out.println("""
                    Which one will you choose?
                    1. insert
                    2. select
                    3. update
                    4. delete
                    5. exit
                    """);
            int cho = scanner.nextInt();
            if (cho == 1){
                dbRepository.insert();
            }
            else if (cho == 2) {
                dbRepository.select();
            }
            else {
                System.out.println("exit.");
                break;
            }
        }
    }
}
