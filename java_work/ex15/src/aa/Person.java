package aa;

public class Person {

    private String resident;
    private String passport;

    public Person() {
    }

    public Person(String resident) {
        this.resident = resident;
    }

    public Person(String resident, String passport) {
        this.resident = resident;
        this.passport = passport;
    }

    public String toString(){
        return "Person {"+"resident = '"+resident+"' passport = '"+passport+"'}";
    }

    public void show(){
        System.out.println("resident = " + resident);
        System.out.println("passport = " + passport);
    }
}

