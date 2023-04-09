### First laboratory, 10 tasks

**1. Find minimum from array.**
   
   
 **My solution:**
```ruby

private static int findMinFromArr(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            int min = findMinFromArr(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
   
```
**Explanation:**
Base case is *n = 1*, in which function returns the first element of the array. In other cases, we compare *n - 1* element with the recursive execution of the function to which *n = n - 1* is passed


**2. Find average from array.**
   
   
**My solution:**
```ruby

private static double findAvrFromArr(int[] arr, int n, int i) {
        if(i == n - 1){
            return arr[i];
        }
        if(i == 0){
            return ((arr[i] + findAvrFromArr(arr, n, i + 1))/ n);
        }
        return (arr[i] + findAvrFromArr(arr, n, i + 1));
    }

```
**Explanation:**
In the base case, *i = n - 1* , we return the array element *i*. When *i = 0*, we retrieve the array's element *i* by adding the value of *i + 1* to the recursive function and dividing the result by the array's length. If not, the array's element *i* will be returned together with the addition and recursive function's value for *i + 1*.


**3.Check for prime number.**
   
   
 **My solution:**
```ruby

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
    
```
**Explanation:**
This function checks whether an integer *n* is a prime number or not, by recursively checking if *n* is divisible by integers starting from *2* up to the square root of *n*. If *n* is divisible by any integer in this range, it is not a prime number, and the function returns *Composite*. If *n* is not divisible by any integer in this range, it is a prime number, and the function returns *Prime*.


**4.Factorial.**
   
   
 **My solution:**
```ruby

 private static int FindFactorial(int n) {
        if(n >= 1){
            return n * FindFactorial(n - 1);
        }
        else{
            return 1;
        }
    }
 
 ```
 **Explanation:**
This function computes the factorial of a given integer *n* recursively, by multiplying *n* with the factorial of *n - 1* until the base case of *n=0* or *n = 1* is reached.


 **5.Fibonacci sequence.**
   
   
 **My solution:**
```ruby

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
    
 ```
 **Explanation:**
This function computes the *h'th* number in the Fibonacci sequence recursively, by summing the previous two numbers in the sequence until the base case of *h = 0* or *h = 1* is reached.


 **6.Pow.**
   
   
 **My solution:**
```ruby

private static int Pow(int a, int n){
        if(n > 0){
            return a * Pow(a, n - 1);
        }
        else{
            return 1;
        }
    }
```
**Explanation:**
This function calculates the result of raising a number *a* to a power *n* recursively, by multiplying *a* with itself *n* times until the base case of *n = 0* is reached.


**7.Array in reverse order.**
   
   
 **My solution:**
```ruby

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

```
**Explanation:**
This function reverses the order of elements in an integer array using recursion. It takes an array *arr* and the indices *s* and *e* that define the starting and ending positions of the portion of the array to be reversed.


**8.Check if string consists only digits.**
   
   
**My solution:**
```ruby
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
    
```
**Explanation:**
This function checks if a string *s* contains any letter using recursion. It takes the string *s* and an index *i* as input, and checks if the character at position *i* is a digit. If it is, the function calls itself recursively with *i - 1* to check the previous character in the string. If the character is not a digit, the function returns *false*. The base case is when the function reaches the first character in the string, where it returns *true*.


**9.Find binominal coefficient.**
   
   
**My solution:**
```ruby

private static int FindBinom(int n, int k){
        if(k == 0){
            return 1;
        }
        if(n == k){
            return 1;
        }
        return FindBinom(n - 1, k - 1) + FindBinom(n - 1, k);
    }
    
```
**Explanation:**
This function calculates the binomial coefficient of two integers *n* and *k* recursively using Pascal's triangle formula.


**10.Find GCD.**
  
  
**My solution:**
```ruby

private static int FindGCD(int x, int y) {
        int z = x % y;
        if(z == 0){
            return y;
        }
        else{
            return FindGCD(y, z);
        }
    }

```
**Explanation:**
This function works by finding the remainder *z* when *x* is divided by *y*. If *z* is zero, then the GCD is *y*. If *z* is not zero, the function calls itself recursively with arguments *y* and *z*.
