package src2;

public class SwitchExample {
    public  static void main(String agrs[]){
        for (int i =0; i < 6; i++)
            switch (i){
                case 0:
                    System.out.println("i equals zero");
                    break;
                case 1:
                    System.out.println("i equals one");
                    break;
                case 2:
                    System.out.println("i equals two");
                    break;
                case 3:
                    System.out.println("i equals three");
                    break;
                    default:
                        System.out.println("i more then three");

            }
    }
}
