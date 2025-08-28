package com.template;

import java.util.*;

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
    public int sumList(List <Integer> list){
        int sum=0;
        for (int i : list){
            sum+=i;
        }
        return sum;
    }
    public int findMax(List<Integer> list) {
        int max;
        max = list.get(0);
        for (int i : list){
            if (i>max){
                max=i;
            }
        }
        return max;
    }
    public List filterEvenNumbers(List<Integer> list){
        List<Integer> list2=new ArrayList<>();
        for (int i : list){
            if (i%2==0){
                list2.add(i);
            }
        }
        return list2;
    }
    public List concatenateLists(List<String> list1, List<String> list2){
        List<String> list3=new ArrayList<>(list1);
        list3.addAll(list2);
        return list3;
    }
    public boolean listContains(List<String> list, String element){
        for (String s : list){
            if (s.equals(element)) {
                return true;
            }
        }
        return false;
    }
    public List<String> toUpperCase(List<String> list){
        List<String> list2=new ArrayList<>();
        for (String s : list){
            s = s.toUpperCase();
            list2.add(s);
        }
        return list2;
    }
    public List<Integer> removeDuplicates(List<Integer> list){
        List<Integer> list2=new ArrayList<>();
        for (int i : list){
            if (!list2.contains(i)){
                list2.add(i);
            }
        }
        return list2;
    }
    public Set<Integer> listToSet(List<Integer> list){
        return new HashSet<>(list);
    }
    public boolean mapContainsKey(Map<String, String> map, String key){
        if (map.containsKey(key)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean mapContainsValue(Map<String, String> map, String value){
        return map.containsValue(value);
    }
    public List<String> iterateMap(Map<String, String> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.add(entry.getKey() + " -> " + entry.getValue());
        }
        return result;
    }




}

