package src3;

public class BoxDemo7 {
    public static void main(String args[]){
        //обьявить выделить патять и инициализировать обьекты от класса Box
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);

        double vol;

        //получение обьема :
        vol = mybox1.volume();
        System.out.println("Обьем 1го равен = " + vol);
        vol = mybox2.volume();
        System.out.println("Обьем 2го равен = " + vol);
    }
}
