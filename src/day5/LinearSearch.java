package day5;

import java.util.*;

public class LinearSearch {

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
  int sequentialSearch(int key){

      for(int counter=0;counter<a.length;counter++) {
          if (a[counter] == key)
              return counter;
      }
      return -1;
  }

    public static void main(String[] args) {
      LinearSearch ls=new LinearSearch();
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        ls.createArray(5);
        ls.printArray();
        System.out.println("enter element to search");
        int e=sc.nextInt();
        int res=ls.sequentialSearch(e);
        if(res==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("found at position:"+(res+1));
        }
    }
}
