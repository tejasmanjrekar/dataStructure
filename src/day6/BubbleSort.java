package day6;

import day5.BinarySearch;

import java.util.Scanner;

public class BubbleSort {

    int a[];
    int done;
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
    void BubbleSort(){
        for(int i=0;i<a.length;i++){ //n=5 n-1->4 i=0,1,2,3
            //for(int i=a.length-1;i>0;i--) for improved
            {
                //done=1;
                for(int j=0;j<a.length-1;j++){ //j should stop at second last
                    //for(int j=0;j<i;j++) // for improved
                    if(a[j]>a[j+1]){
                        //done=0;
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
           // if(done==1)
              //  break;
        }
    }
    void BubbleSort2(){
        for(int i=a.length-1;i>0;i--){
            done=1;
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    done=0;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(done==1) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs=new BubbleSort();
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        bs.createArray(size);
        bs.printArray();
        //bs.BubbleSort();
        //System.out.println("After Sorting");
        //bs.printArray();
        bs.BubbleSort2();
        System.out.println("After Sorting");
        bs.printArray();


    }
}
