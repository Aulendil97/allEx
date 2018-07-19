package src2.src2_1;

public class NestedExample {
    public static void main(String args[]){
        int i, j;

        for (i = 0; i<10; i++){
            for (j=i;j<10;j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
