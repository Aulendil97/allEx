package src2.src2_1;

public class ContinueExample {
    public static void main(String args[]){
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if (i%2== 0) continue;
            System.out.println("");
        }
    }
}
