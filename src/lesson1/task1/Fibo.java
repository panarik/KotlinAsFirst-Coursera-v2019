package lesson1.task1;

public class Fibo {

    public static void main(String[] args) {
        /*
        Ряд Фибоначи начинается так: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711...
        */
        int a = 0;
        int b = 1;
        int c = 1;
        while (c < 17711) {
            c = a + b; // первое и последующее сложение
            a = b; //
            b = c;
            System.out.println("result = " +c);
            System.out.println("a = " +a);
            System.out.println("b = " +b);
        }

    }
}
