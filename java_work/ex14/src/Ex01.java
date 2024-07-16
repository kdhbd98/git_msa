class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public void greeting() {
        System.out.println(name + " hello");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person { " + "name = ' " + name + '\'' + " , age = " + age + '}';
    }
}

// 생성자로 private 변수를 바꿀 수 있다.
// setter 로 private 변수를 바꿀 수 있다.
public class Ex01 {
    public static void main(String[] args) {
        // 기본 생성자 선언 후에 setter 로 변수 name 변경
        Person p1 = new Person("선승진");
        // name 을 바꾸는 다른 생성자로 선언함
        Person p2 = new Person("박정무");
        p1.setName("박지원");

        p1.greeting();
        p2.greeting();

        System.out.println(p1);
        System.out.println(p2);
    }
}
