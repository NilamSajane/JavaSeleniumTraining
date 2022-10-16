package day3;

public class ExampleCondition {

    public static void main(String[] args) {

        String browser = "Chrome";

        if(browser.equalsIgnoreCase("chrome")) {
            System.out.println("opening chrome browser");
        } else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("opening firefox browser");
        }
    }
}
