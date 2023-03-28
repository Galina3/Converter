package task1;

public class Converter {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Поменяйте местами значения, используя третью переменную
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
