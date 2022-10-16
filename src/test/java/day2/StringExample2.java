package day2;

public class StringExample2 {

    public static void main(String[] args) {
                  // 0,1,2
        String name = "Arvind";

        System.out.println(name.equals("ARvind"));
        System.out.println(name.equalsIgnoreCase("ARvind"));
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,5));
    }
}
