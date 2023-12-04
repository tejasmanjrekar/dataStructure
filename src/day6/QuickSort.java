package day6;

import java.util.Scanner;

public class QuickSort {
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
    void quickSort(int start,int end)
    {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=start;
        while(i<j){
            while(a[i]<a[pivot]){
                i++;
            }
            while(a[j]>a[pivot]){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        if(i<end){
             quickSort(pivot+1,end);
            //quickSort(i+1,end); same way
        }
        else if(j>start){
             quickSort(start,j-1);
        }
        }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        qs.createArray(size);
        qs.printArray();
        qs.quickSort(0,size-1);
        System.out.println("Sorted array is");
        qs.printArray();
    }
}
