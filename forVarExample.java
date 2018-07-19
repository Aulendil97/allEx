package src2.src2_1;

public class forVarExample {
    public static void main(String args[]){
        int i;
        boolean done = false;

        i = 0;
        for ( ; done; ){
            System.out.println("i все равно " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
