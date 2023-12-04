package day5;

import java.util.Scanner;

public class BinarySearch {

    int a[];
    // static int size;

    void createArray(int size){
        // this.size=size;
        a=new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+size+" Elements");
        for(int counter=0;counter<size;counter++){
            System.out.println("enter element at"+counter+":");
            a[counter]= sc.nextInt();
        }
    }
    void printArray(){
        for(int counter=0;counter<a.length;counter++){
            System.out.println(a[counter]);
        }
    }
    int binarySearch(int start,int end,int key){
        if(start==end) //only 1 left
        {
            if(key==a[start]){
                return start;
            }
            else{
                return -1;
            }
        }
        else{
            int mid=(start+end)/2;
            if(a[mid]==key){
                return mid;
            }
            else{
                if(key<a[mid]){
                    return binarySearch(start,mid-1,key);
                   // a[end]=mid-1;
                }
                else{
                    return binarySearch(mid+1,end,key);
                   // a[start]=mid+1;
                }
            }
        }
        //return binarySearch();
    }

    public static void main(String[] args) {
        BinarySearch bs=new BinarySearch();
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        bs.createArray(size);
        bs.printArray();
        System.out.println("enter element to search");
        int e=sc.nextInt();
//        System.out.println("enter start");
//        int start=sc.nextInt();
//        System.out.println("enter end");
//        int end=sc.nextInt();
        int res=bs.binarySearch(0,size-1,e);
        if(res==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("found at position:"+(res+1));
        }
    }
}
