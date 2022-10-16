package day4;

public class Loops2 {

    public static void main(String[] args) {
         //                   0         1       2         3
        String names [] = {"Arvind","Madhuri","Neelima","Kavya"};

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("----------------------");

        for(int i = names.length-1; i >=0; i--){
            System.out.println(names[i]);
        }
    }
}
