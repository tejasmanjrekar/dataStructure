package day6;

import java.util.Scanner;

public class InsertionSort {
    int a[];

    void createArray(int size) {
        // this.size=size;
        a = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " Elements");
        for (int counter = 0; counter < size; counter++) {
            System.out.println("enter element at" + counter + ":");
            a[counter] = sc.nextInt();
        }
    }

    void printArray() {
        for (int counter = 0; counter < a.length; counter++) {
            System.out.println(a[counter]);
        }
    }

    void insertionSort() {
        for (int i = 0; i < a.length - 1; i++) {
            int new_element = a[i + 1]; //next to i
            int j = i + 1; // j goes from i+1 to 0
            while (j > 0 && a[j - 1] > new_element) { //boundary conditions
                //boundary    element already in list
                // of j        is greater than new
                a[j] = a[j - 1];
                j--;
            }
            a[j] = new_element;
        }
    }

    public static void main(String[] args) {
        InsertionSort ss = new InsertionSort();
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ss.createArray(size);
        ss.printArray();
        ss.insertionSort();
        System.out.println("Sorted array is");
        ss.printArray();
    }
}
