/*
   jdk 기본 시스템 -> getter, setter, toString 함수 사용 불가능
   maven lombok 검색 후 최신 버전을 클릭한 후 복사 + 붙여넣기
   site : https://mvnrepository.com/artifact/org.projectlombok/lombok
   이 복사한 것을 pom 에서 dependency 입력 후 괄호 사이에 붙여넣기
   마지막으로 AllArgsConstructor, toString 함수 import 하기
   그 후 @로 함수 부르기
 */

package org.example;

import org.example.aa.Student;

public class Main {

    Main(){
        Student student = new Student("박문치", 90,80, 70);
        System.out.println(student);
        float result = student.getAverage();
        System.out.println(result);
        System.out.println(student.getTotal());
    }
    public static void main(String[] args) {
        new Main();
    }
}