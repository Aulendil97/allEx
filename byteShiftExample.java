package src2;

public class byteShiftExample {
    public static void main(String agrs[]){
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение a = " + a);
        System.out.println("i и b = " + i + " " +  b);
    }
}