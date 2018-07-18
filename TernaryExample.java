package src2;

public class TernaryExample {
    public static void main(String agrs[]){
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; //Получить абсолютное значение i
        System.out.println("Абсолютное значение : " + i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение : " + i + " равно " + k);
    }
}
