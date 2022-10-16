package day2;

public class StringExample3 {

    public static void main(String[] args) {
                   // 0,1,2
        String name = "Arvind is from Bangalore";
        // "Arvind" "is" "from" "Bangalore"
        for(String str : name.split(" ")){
        System.out.println(str);
        }

        //  System.out.println(name.split(" ")[0]);
        //  System.out.println(name.split(" ")[1]);
        //  System.out.println(name.split(" ")[2]);
        //  System.out.println(name.split(" ")[3]);

        /**
         * for(datatype ref : name){
         * //code
         * }
         * arrays
         * list
         * set
         * map
         */
    }
}
