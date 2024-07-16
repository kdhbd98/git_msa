//  alt + insert => constructor 자동 생성
//  ctrl + e => class 이동

package aa;

public class TV {
    private String name;
    private int year;
    private int inch;

    public TV(String name, int year, int inch) {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.println(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }
}
