public class BooleanExample {
    public static void main (String args []){
        boolean b;
        b = false;
        System.out.println("B = " +b);
        b = true;
        System.out.println("B = " +b);

        if(b)System.out.println("This cod is running");
        b = false;
        if(b)System.out.println("This code isn't running");

        System.out.println("10 > 9 equals : " + (10>9));
    }
}
