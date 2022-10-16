package day4;

public class Calculator {



    public static void main(String[] args) {
      Calculator cal =  new Calculator(); // Class object
        cal.add(1000,222);
    }



    // Method
    //access modifier void is a return type method Name(parameters)
    public void add(int x, int y){
        int sum = x + y;
        System.out.println(sum);
    }
}
