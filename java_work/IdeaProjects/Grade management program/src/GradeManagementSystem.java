import java.util.*;

class Student {
    private String name;
    private int id;
    private Map<String, Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public void printGrades() {
        System.out.println(name + "의 성적:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class GradeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n성적 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 성적 입력");
            System.out.println("3. 성적 조회");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("학생 이름을 입력하세요: ");
                    String name = scanner.nextLine();
                    System.out.print("학생 ID를 입력하세요: ");
                    int id = scanner.nextInt();
                    students.add(new Student(name, id));
                    System.out.println("학생이 추가되었습니다.");
                    break;
                case 2:
                    System.out.print("성적을 입력할 학생의 ID를 입력하세요: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.getId() == searchId) {
                            System.out.print("과목 이름을 입력하세요: ");
                            String subject = scanner.nextLine();
                            System.out.print("성적을 입력하세요: ");
                            int grade = scanner.nextInt();
                            student.addGrade(subject, grade);
                            System.out.println("성적이 입력되었습니다.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("해당 ID의 학생을 찾을 수 없습니다.");
                    }
                    break;
                case 3:
                    System.out.print("성적을 조회할 학생의 ID를 입력하세요: ");
                    int searchId2 = scanner.nextInt();
                    scanner.nextLine();
                    // 학생 ID로 학생을 검색
                    boolean found2 = false;
                    for (Student student : students) {
                        if (student.getId() == searchId2) {
                            student.printGrades();
                            found2 = true;
                            break;
                        }
                    }
                    if (!found2) {
                        System.out.println("해당 ID의 학생을 찾을 수 없습니다.");
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
            }
        }
    }
}