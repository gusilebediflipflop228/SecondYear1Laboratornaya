import java.util.Scanner;

public class Arrays {

    public static int choice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания");
        return scan.nextInt();
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] inputArr() {
        System.out.println("Введите размерность массива ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите числа");
        for (int i = 0; i < arr.length; i++) {
            int value = scan.nextInt();
            arr[i] = value;
        }
        return arr;
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int item : arr) { // цикл for each
            sum += item;
        }
        /* for(int item = 0; item < arr.length; item++) {
                sum += arr[item];
        }*/
        return sum;
    }

    public static int evenNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int quantityInRange(int[] arr, int low, int high) {
        int count = 0;
        for (int j : arr) {
            if ((j >= low) && (j <= high)) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean positiveNumbersArray(int[] arr) {
        for (int i : arr) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] reverseSort(int[] arr) {
        int buffer;
        int j = (arr.length - 1); // массив с нуля
        for (int i = 0; i < (arr.length / 2); i++) {
            buffer = arr[i];
            arr[i] = arr[j];
            arr[j] = buffer;
            j -= 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        switch (choice()) {
            case (1):
                //printArr(new int[]{52, 53, 54});
                int[] array = {1, 2, 3};
                printArr(array);
                break;
            case (2):
                printArr(inputArr());
                break;
            case (3):
                int[] arr = {-5, 6, -7};
                System.out.println("Сумма = " + sumArr(arr));
                break;
            case (4):
                int[] arr2 = {-5, 6, -7, 2, -2, 5, 2, 2, 2};
                System.out.println("Четных чисел: " + evenNumbers(arr2));
                break;
            case (5):
                int[] arr3 = {0, 1, 2, 3, 4, 5};
                System.out.println(quantityInRange(arr3, 1, 4));
                break;
            case (6):
                int[] arr4 = {1, 2, 3, 3};
                int[] arr5 = {-5, 6, -7, 2, -2, 5, 2, 2, 2};
                System.out.println(positiveNumbersArray(arr4));
                System.out.println(positiveNumbersArray(arr5));
                break;
            case (7):
                int[] arr6 = {1, 2, 3, 4, 5};
                printArr((reverseSort(arr6)));
        }

    }
}


