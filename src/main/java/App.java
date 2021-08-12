import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[] arr = generateArray(30, 10, 90);
        printArray(arr);
        System.out.format("Sum = %d\n", sumElements(arr));

        if (isAllEven(arr)) {
            System.out.println("Mảng chẵn.");
        } else System.out.println("Mảng không chẵn.");


        // BAI 2B
        if (isPrimeNumber(arr)) {
            System.out.println("Mảng này là mảng toàn số nguyên tố.");
        } else System.out.println("Mảng này là mảng không toàn số nguyên tố.");

        // BAI 2C
        if (isIncreaseNumber(arr)) {
            System.out.println("Mảng là mảng tăng dần.");
        } else System.out.println("Mảng là mảng không tăng dần.");

        // BAI 3A
        System.out.format("Có %d số chia hết cho 4 nhưng không chia hết cho 5 \n", sumLenght(arr));

        // BAI 3B
        System.out.format("Tổng các số nguyên tố có trong mảng\n", sumPrimeNumber(arr));

        sortArrayAsc(arr);
        printArray(arr);
        isPrimeNumber(arr);
        isIncreaseNumber(arr);
        sumLenght(arr);
        sumPrimeNumber(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d, ", arr[i]);
        }
        System.out.println();
    }

    public static int sumElements(int[] arr) {
        int ret = 0;
        for (int ele : arr) {
            ret += ele;
        }
        return ret;
    }

    // interchangeSort
    public static void sortArrayAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static int[] generateArray(int n, int min, int max) {
        int[] ret = new int[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }

        return ret;
    }

    public static boolean isAllEven(int[] arr) {
        for (int n : arr) {
            if (n % 2 != 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrimeNumber(int[] arr) {
        // so nguyen n < 2 khong phai la so nguyen to
        for (int n : arr) {
            if (n < 2) {
                return false;
            }
            // check so nguyen to khi n >= 2
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
            return true;

    }
    public static boolean isIncreaseNumber(int[] arr) {
        for (int n : arr){
            for ( int i=0;i<=n;i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static  int sumLenght(int[] arr) {
        int count1 = 0;
        for (int i = 0; i < arr.length - 1; i++)  {
                if ((i % 4 == 0) &&(i % 5 != 0)) {
                    count1 = count1 + 1;

            }
        }
        return count1;
    }

    public static int sumPrimeNumber(int[] arr) {
        // so nguyen n < 2 khong phai la so nguyen to
        int sum2 = 0;
        for (int n : arr) {
            if (n >= 2) {
            // check so nguyen to khi n >= 2
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i != 0) {
                    sum2 = sum2 + n;
                }
            }
            }
        }
        return sum2;

    }
}