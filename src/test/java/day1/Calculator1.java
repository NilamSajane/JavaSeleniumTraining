package day1;

public class Calculator1 {

    public static void main(String[] args) {

     Calculator cal = new Calculator();//Class object
     cal.addNumbers(20,30);

    }

    // Method
    // Access Modifier return type Method Name(Parameter)
    public void addNumbers(int x, int y) {
        int sum = x + y;
        System.out.println("Addition of two numbers: "+sum);
    }
}