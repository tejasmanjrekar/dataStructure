package day6;

import java.util.Scanner;

public class MergeSort {
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
    void Merger(int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int temp[]=new int[a.length];
        int tindex=start;
        while(i<=mid && j<=end){
            if(a[i]<a[j]){
                temp[tindex++]=a[i++];
            }
            else{
                temp[tindex++]=a[j++];
            }
        }
        while(i<=mid)
            temp[tindex++]=a[i++];
        while(j<=end)
            temp[tindex++]=a[j++];

        for(i=start;i<=end;i++)
            a[i]=temp[i];
    }
    void mergeSort(int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);
            Merger(start,mid,end);
        }
    }

    public static void main(String[] args) {
        MergeSort ms=new MergeSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int size=sc.nextInt();
        ms.createArray(size);
        ms.mergeSort(0,size-1);
        System.out.println("After Sort");
        ms.printArray();
    }
}
