package Assignment2;

public class Calculator {
    
    public static void main(String[] args) {
     
        Calculator cal = new Calculator();
        cal.SubstractNumbers(55,40);
    }

    private void SubstractNumbers(int i, int i1) {
        int substract =  i-i1;
        System.out.println("Substraction of two numbers: "+substract);
    }
}
