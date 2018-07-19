package src3;

   public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    //извлечение элемента из стэка
    int pop() {
        if (tos < 0) {
            System.out.println("Stack is free");
            return 0;
        }
        else
            return stck[tos--];
    }
}
