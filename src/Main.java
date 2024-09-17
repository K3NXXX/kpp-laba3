import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Завдання № 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число A: ");
        double A = scanner.nextDouble();

        System.out.print("Введіть кількість чисел n: ");
        int n = scanner.nextInt();

        double[] b = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть число b" + (i + 1) + ": ");
            b[i] = scanner.nextDouble();
        }

        double result = A;
        for (int i = 0; i < n; i++) {
            result -= b[i];
        }

        System.out.println("Результат: " + result);

        //Задвання № 57
        System.out.print("Введіть число x: ");
        double x = scanner.nextDouble();
        int sqrtFloorX = (int) Math.floor(Math.sqrt(x));

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += (1.0 / factorial(i)) + sqrtFloorX;
        }

        System.out.println("Сума за завданням № 57: " + sum);
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
