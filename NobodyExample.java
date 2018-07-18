package src2;

public class NobodyExample {
    public static void main(String args[]){
        int i, j;
        i = 100;
        j = 200;

        while (++i < --j);
        System.out.println("Averae is " + i);
    }
}
