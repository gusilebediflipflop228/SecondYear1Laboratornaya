import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.sin;

public class Main {

    public static int choice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        return scan.nextInt();
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static void threeFloatNumbers() {
        float a, b, с;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = scan.nextFloat();
        System.out.print("Второе: ");
        b = scan.nextFloat();
        System.out.print("Третье: ");
        с = scan.nextFloat();
        System.out.println("Ваши числа: " + a + ", " + b + ", " + с);
        System.out.println("Их произведение: " + a * b * с);
        System.out.println("Среднее арифметическое: " + (a + b + с) / 3);

        if (a >= b) {
            if (a >= с) {
                if (с >= b) {
                    System.out.println("Ваши числа в порядке возрастания: " + b + ", " + с + ", " + a);
                } else System.out.println("Ваши числа в порядке возрастания: " + с + ", " + b + ", " + a);
            } else System.out.println("Ваши числа в порядке возрастания: " + b + ", " + a + ", " + с);
        } else if (a >= с) System.out.println("Ваши числа в порядке возрастания: " + с + ", " + a + ", " + b);
        else if (b >= с) System.out.println("Ваши числа в порядке возрастания: " + a + ", " + с + ", " + b);
        else System.out.println("Ваши числа в порядке возрастания: " + a + ", " + b + ", " + с);

    }

    public static void threeIntNumbers() {
        int n1, n2, n3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        n1 = scan.nextInt();
        System.out.print("Второе: ");
        n2 = scan.nextInt();
        System.out.print("Третье: ");
        n3 = scan.nextInt();
        System.out.println("Ваши числа: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Их произведение: " + n1 * n2 * n3);
        System.out.println("Среднее арифметическое: " + (double) (n1 + n2 + n3) / 3);
        if (n1 >= n2) {
            if (n1 >= n3) {
                if (n3 >= n2) {
                    System.out.println("Ваши числа в порядке возрастания: " + n2 + ", " + n3 + ", " + n1);
                } else System.out.println("Ваши числа в порядке возрастания: " + n3 + ", " + n2 + ", " + n1);
            } else System.out.println("Ваши числа в порядке возрастания: " + n2 + ", " + n1 + ", " + n3);
        } else if (n1 >= n3) System.out.println("Ваши числа в порядке возрастания: " + n3 + ", " + n1 + ", " + n2);
        else if (n2 >= n3) System.out.println("Ваши числа в порядке возрастания: " + n1 + ", " + n3 + ", " + n2);
        else System.out.println("Ваши числа в порядке возрастания: " + n1 + ", " + n2 + ", " + n3);
    }

    public static void solutionEquation() {
        float a, b, c, discriminant;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = scan.nextFloat();
        System.out.print("Второе: ");
        b = scan.nextFloat();
        System.out.print("Третье: ");
        c = scan.nextFloat();
        discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Нет корней");
        } else if (discriminant == 0) {
            System.out.println("Один корень: " + ((-b) / (2 * a)));
        } else
            System.out.println("Первый корень = " + ((-b + sqrt(discriminant)) / (2 * a))
                    + " Второй корень равен: " + ((-b - sqrt(discriminant)) / (2 * a)));
    }

    public static void tabulationSin(double range1, double range2, double shag) {
        for (double x = range1; x <= range2; x += shag) {
            System.out.println("Значение x: " + x + " Значение sin(x): " + sin(x));
        }
    }

    public static String systemEquation(double a, double b, double c, double d, double e, double f) {

        if (((a == 0) && (b != 0)) && ((d == 0) && (e != 0))) {
            //double y = c/b;
            return "y= " + c / b + " x - любое";

        } else if (((a != 0) && (b == 0)) && ((d != 0) && (e == 0))) {
            return "y - любое" + "x=" + f / d;

        } else if (((a == 0) && (b == 0)) || ((d == 0) && (e == 0))) {
            return "СЛУ иммет бесконечное множество решений";

        } else if (((a / d) == (b / e)) && ((a / d) != (c / f))) {
            return "СЛУ не имеет решений";

        } else {
            double x = (c * e - b * f) / (a * e - b * d);
            double y = (a * f - c * d) / (a * e - b * d);
            return x + " " + y;
        }
    }

    public static double rowTaylor(double x, double accuracy) {
        double element = 1, ans = 1;
        int n = 1;
        while (element >= accuracy) {
            element *= x / n;
            ans += element;
            n++;
        }
        return ans;
    }

    public static void main(String[] args) {
        switch (choice()) {
            case (1):
                printHelloWorld();
                break;
            case (2):
                threeFloatNumbers();
                break;
            case (3):
                threeIntNumbers();
                break;
            case (4):
                solutionEquation();
                break;
            case (5):
                tabulationSin(0, 1.55, 0.5);
                tabulationSin(0, 6.28, 3.14 / 4);
                tabulationSin(0, 3.14, 3.14 / 8);
                break;
            case (6):
                System.out.println(systemEquation(2, 3, 6, 1, -1, 1));
                System.out.println(systemEquation(1, 1, 6, 1, -1, 2));
                System.out.println(systemEquation(1, 2, 4, 1, 2, 5));
                break;
            case (7):
                System.out.println("Ответ: " + rowTaylor(1, 0.01));
                break;
        }
    }
}