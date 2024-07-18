public class Box {
    public String name;

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        return "Box { name " + name + " }";
    }
}
//    null => 어떤 값도 들어있지 않다는 뜻
//    alt + insert 누른 후 "toString" 선택
//    public String toString() {
//        return "Box{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}

