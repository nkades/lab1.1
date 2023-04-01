import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which function?");
        Scanner scanner = new Scanner(System. in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        switch (a){
            case 1:
                int min = findMinFromArr(array, n);
                System.out.println(min);
            case 2:
                double avr = findAvrFromArr(array, n, 0);
                System.out.println(avr);
        }

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