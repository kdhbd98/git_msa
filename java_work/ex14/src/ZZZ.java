import aa.AAA;

public class ZZZ extends AAA {
    int zzz = 10;
    ZZZ(){
        System.out.println("여기에서 할 거에요.");
        System.out.println(zzz);
        System.out.println(aaa);
    }

    public static void main(String[] args) {
        ZZZ zzz = new ZZZ();

    }
}
