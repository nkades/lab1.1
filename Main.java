import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which function?");
        Scanner scanner = new Scanner(System. in);
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                int n = scanner.nextInt();
                int[] array = cin(n);
                int min = findMinFromArr(array, n);
                System.out.println(min);
                break;
            case 2:
                int c = scanner.nextInt();
                int[] arr = cin(c);
                double avr = findAvrFromArr(arr, c, 0);
                System.out.println(avr);
                break;
            case 3:
                int g = scanner.nextInt();
                System.out.println(PrimeOrNot(g, 2));
                break;
            case 4:
                int f = scanner.nextInt();
                System.out.println(FindFactorial(f));
                break;
            case 5:
                int h = scanner.nextInt();
                System.out.println(FindFibonacci(h - 1));
                break;
            case 6:
                int j = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(Pow(j, b));
                break;
            case 7:
                int e = scanner.nextInt();
                int[] ar = cin(e);
                ReverseOrder(ar, 0, e - 1);
                for(int i = 0; i < e; i++){
                    System.out.println(ar[i]);
                }
                break;
            case 8:
                Scanner scan = new Scanner(System.in);
                String s = scan.nextLine();
                int l = s.length();
                if(CheckIsThereNumbers(s, l - 1)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
                break;
            case 9:
                int w = scanner.nextInt();
                int p = scanner.nextInt();
                System.out.println(FindBinom(w, p));
            case 10:
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if(x > y){
                    System.out.println(FindGCD(x, y));
                }
                else{
                    System.out.println(FindGCD(y, x));
                }

        }

    }

    private static int FindBinom(int n, int k){
        if(k == 0){
            return 1;
        }
        if(n == k){
            return 1;
        }
        return FindBinom(n - 1, k - 1) + FindBinom(n - 1, k);
    }
    private static int FindGCD(int x, int y) {
        int z = x % y;
        if(z == 0){
            return y;
        }
        else{
            return FindGCD(y, z);
        }
    }

    private static int FindFibonacci(int h) {
        if(h == 0){
            return 1;
        } else if (h == 1) {
            return 1;
        }
        else{
            return FindFibonacci(h - 1) + FindFibonacci(h - 2);
        }
    }

    private static boolean CheckIsThereNumbers(String s, int i){
        if(i == 0){
            return true;
        }
        else{
            char a = s.charAt(i);
            if(Character.isDigit(a)){
                return CheckIsThereNumbers(s, i - 1);
            }
            else{
                return false;
            }
        }
    }
    private static int FindFactorial(int n) {
        if(n >= 1){
            return n * FindFactorial(n - 1);
        }
        else{
            return 1;
        }
    }
    private static int Pow(int a, int n){
        if(n > 0){
            return a * Pow(a, n - 1);
        }
        else{
            return 1;
        }
    }
    private static int[] ReverseOrder(int[] arr, int s, int e){
        if(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            ReverseOrder(arr, s + 1, e - 1);
        } else if (s == e) {
            return arr;
        }
        return null;
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