package com.template;
public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a,int b) {
        if (a>b){
            return a;
            }
        else{
            return b;
            }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
            int resultado = 1;
            for(int i=1;i<=n;i++) {
                resultado *= i;
            }
            return resultado;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int chars = input.length();
        return chars;
    }

    // 6. Reverse a String
    public String reverse(String input){
        return new StringBuilder(input).reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int minimo=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo=array[i];
            }
        }
        return minimo;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double farenheit = 0;
        farenheit = (double) (celsius * 1.8 + 32);
        return farenheit;
    }
}
