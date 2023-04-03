import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which function?");
        Scanner scanner = new Scanner(System. in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        switch (a) {
            case 1:
                int[] array = cin(n);
                int min = findMinFromArr(array, n);
                System.out.println(min);
                break;
            case 2:
                int[] arr = cin(n);
                double avr = findAvrFromArr(arr, n, 0);
                System.out.println(avr);
                break;
            case 3:
                System.out.println(PrimeOrNot(n, 2));
                break;
            case 4:
                System.out.println(Factorial(n));
            case 5:
                int b = scanner.nextInt();
                System.out.println(pow(n, b));
        }

    }

    private static int Factorial(int n) {
        if(n >= 1){
            return n * Factorial(n - 1);
        }
        else{
            return 1;
        }
    }
    private static int pow(int a, int n){
        if(n > 0){
            return a * pow(a, n - 1);
        }
        else{
            return 1;
        }
    }

    private static String PrimeOrNot(int n, int i) {
        if(n == i){
            return "Prime";
        }
        else if (n % i == 0){
            return "Composite";
        }
        else{
            return PrimeOrNot(n, i + 1);
        }
    }

    private static int[] cin(int n){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    private static double findAvrFromArr(int[] arr, int n, int i) {
        if(i == n - 1){
            return arr[i];
        }
        if(i == 0){
            return ((arr[i] + findAvrFromArr(arr, n, i + 1))/ n);
        }
        return (arr[i] + findAvrFromArr(arr, n, i + 1));
    }

    private static int findMinFromArr(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            int min = findMinFromArr(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
}