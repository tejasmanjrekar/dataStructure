package day7;

import day6.InsertionSort;
import day6.MergeSort;

import java.util.Scanner;

public class HeapSort {

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

    void HeapSort(){
        int i,k,pc,temp,done=0;
        for(i=a.length-1;i>=0;i--)//end to first
        {
            for(k=0;k<=i;k++){
                pc=k;
            }
        }
    }
    public static void main(String[] args) {
        HeapSort ms = new HeapSort();
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ms.createArray(size);
        ms.printArray();
        //ss.insertionSort();
        System.out.println("Sorted array is");
        //ss.printArray();
    }
}
