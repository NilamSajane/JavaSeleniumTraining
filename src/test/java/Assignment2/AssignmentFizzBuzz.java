package Assignment2;

public class AssignmentFizzBuzz {

    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
            System.out.println("FizzBuzz");}
           if (i % 5 == 0){
                System.out.println("Buzz");}
            else if (i % 3 == 0){
                System.out.println("Fizz");}
            else{
                System.out.println(i + "");}


        }
    }
}
