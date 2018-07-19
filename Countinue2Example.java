package src2.src2_1;

public class Countinue2Example {
    public static void main(String args[]){
       outer: for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++){

            if (j > i) {
                System.out.println();
                continue outer;
            }
            System.out.print(" " + (i * j));
        }
    }
    System.out.println();
    }
}


