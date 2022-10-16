package day4;

public class Loops4 {

    public static void main(String[] args) {
        //                    0
        String names [] = {"Arvind","Madhuri","Neelima","Kavya"};

        /**
         *
         * for(DataTypes ref : arrayname)
         *
         * }
         */


        for(String ref : names){

            if(ref.contains("Neelima")){
                System.out.println("Match Found " + ref );
                break;
            }else{
            System.out.println(" Not match found " );
            }
        }
    }
}
