package array;

import java.util.Random;
import java.util.Scanner;

public class Array {

    // Declare array
    int a[];
    // Declare amount element of array;
    int n;

    // 1. Write function to return array consist of n element
    // 2. Write function add one value to last array
    // 3. Write function calculator sum first two element of array
    // 4. Write function calculator sum element of array
    // 5. Write function find min value of array
    // 6. Write function find max value of array
    // 7. Write function print random element of array
    // 8. Write function sort array descending
    // 9. Write function sort array ascending

    public Array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input amount element of arrays : ");
        n = sc.nextInt();
        a = createArray(n);
    }

    // Function to create array
    public int[] createArray(int n) {
        Random random = new Random();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = random.nextInt(100) + 1;
        }
        return temp;
    }

    // Function to print array
    public void printArray() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    // Add one element to last array
    public void addElementToLastArray(int x) {
        // Increase size of array
        n = n + 1;
        int[] temp = new int[n];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        temp[n - 1] = x;

        a = temp;
    }

    public int calculatorSumOfArray() {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum of element in arrays : " + sum);
        return sum;
    }

    // Function calculator first two element of array
    public int calculatorFirstTwoElementArray() {
        int sum = 0;
        for (int i = 0; i < 2 && i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum first two element : " + sum);
        return sum;
    }

    // Function find min value in array
    public void findMinValueOfArray() {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Min value of array : " + min);
    }

    // Function find max value in array
    public void findMaxValueOfArray() {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Max value of array : " + max);
    }

    // Function find random index in array;p
    public void findIndexRandom() {
        Random random = new Random();
        int index = random.nextInt(a.length);
        System.out.println("a[" + index + "] = " + a[index]);
    }

    public void sortArrayDescending() {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] > a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public void sortArrayAscending () {
        for (int i = 0; i < a.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < a.length ; j++) {
                if(a[j] < a[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.addElementToLastArray(35);
        System.out.print("Value off arrays : ");
        array.printArray();
        System.out.println("\n");
        array.calculatorFirstTwoElementArray();
        array.calculatorSumOfArray();
        array.findMinValueOfArray();
        array.findMaxValueOfArray();
        array.findIndexRandom();
        array.sortArrayDescending();
        System.out.print("Array descending : ");
        array.printArray();
        System.out.println("\n");
        System.out.print("Array ascending : ");
        array.sortArrayAscending();
        array.printArray();
    }
}
