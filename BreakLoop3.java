package src2.src2_1;

public class BreakLoop3 {
    public static void main(String args[]){
        for (int i = 0;i<3;i++){
            System.out.print("Pass" + i + " : ");
            for (int a = 0; a<100; a++ ){
                if (a == 10)break;

                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println("the end.");
    }
}
