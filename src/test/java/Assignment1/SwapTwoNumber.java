package Assignment1;

import java.util.Scanner;

public class SwapTwoNumber {

    public static void main(String[] args) {

         int a =23; int b= 43;
         System.out.println("Enter two Numbers ");
         Scanner r = new Scanner(System.in);
         a=r.nextInt();
         b=r.nextInt();
         System.out.println("Before Swaping "+ a+" "+b);

        int temp = a;
         b=a;
         b=temp;
        System.out.println("After Swaping "+ a+" "+b);
    }
}
