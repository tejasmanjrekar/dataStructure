package day6;

import java.util.Scanner;

public class SelectionSort {
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

    void selectionSort() {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int pos = i;
            for (int j = i+1; j < a.length - 1; j++) {
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ss.createArray(size);
        ss.printArray();
        ss.selectionSort();
        System.out.println("Sorted array is");
        ss.printArray();
    }
}