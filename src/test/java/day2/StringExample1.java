package day2;

public class StringExample1 {

    public static void main(String[] args) {
                    // 0,1,2
        String name = "Arvind";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.replace("i", "!"));
        System.out.println(name.startsWith("Arv"));
        System.out.println(name.endsWith("nd"));
        System.out.println(name.contains("vi"));
        System.out.println(name.charAt(2));
    }
}
