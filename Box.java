package src3;

public class Box {
    double weight;
    double height;
    double depth;

    //конструктор класса BOX
    Box(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }

    //расчитать и возвратить обьем
    double volume(){
        return weight*height*depth;
    }
}
