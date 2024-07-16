public class Ex06 {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbb";

        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println("aaa".concat(b));

        System.out.println(a.compareTo("aaa"));
        System.out.println(a.compareTo("AAA"));
        System.out.println(a.compareTo("abcdef"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("AAA"));
        System.out.println(a.compareToIgnoreCase("Aaa"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("AAA"));
        System.out.println(a.compareToIgnoreCase("AAaa"));
        System.out.println(a.compareToIgnoreCase("abcdefghijklmn"));
    }
}
