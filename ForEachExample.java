package src2.src2_1;

public class ForEachExample {
    public static void main(String args[]){
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x: nums){
            System.out.println("Значение равно = " + x);
            sum += x;
        }
        System.out.println("Сумма равна = " + sum);
    }
}
