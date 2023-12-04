package day1;
import java .util.Scanner;
public class StackExample { //class

     //parts
    int stack[],tos,maxSize;
    void createStack(int size){
        //create array
        stack=new int[size];
//        for(int i=0;i<=size;i++){
//
//        }
        //initialize max size
        maxSize=size;


        //initialize tos
        tos=-1;
    }

    void push(int e){
        tos++;
        stack[tos]=e;
    }
    boolean is_Full(){
        if(tos==maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }

    int pop(){
        int temp=stack[tos]; // copy old data
        tos--;
        return temp;
    }
    boolean is_Empty(){
        if(tos==-1){
            return true;
        }
        else{
            return false;
        }
    }
    int peak(){
        int peak=stack[tos];
        return peak;
    }
    void printStack(){
        for(int i=tos; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackExample se=new StackExample();
        //System.out.println("Enter the length of array");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        se.createStack(size);
        //int length=sc.nextInt();
       // System.out.println("Enter the number of elements of stack");
//        for(int counter=0;counter<length;counter++){
//
//        }
        int ch;



        do{
            System.out.println("Enter the choice");
            System.out.println("\n 1.Push \n 2.Pop \n 3.Peak \n 4.Print \n 5.Exit");
            ch=sc.nextInt();
            switch (ch) {

            case 1:
                if (se.is_Full() != true) {
                    System.out.println("Enter element");
                    int e = sc.nextInt();
                    se.push(e);
                } else {
                    System.out.println("Stack is full");
                }
                break;
            case 2:
                if (se.is_Empty() != true) {
                    System.out.println("Element pop" + se.pop());
                } else {
                    System.out.println("Stack is empty");
                }
                break;
            case 3:
                if (se.is_Empty() != true) {
                    System.out.println("Top element of stack is:" + se.peak());
                } else {
                    System.out.println("Stack is empty");
                }
                break;
            case 4:
                if (se.is_Empty() != true) {
                    System.out.println("Stack is:");
                    se.printStack();
                } else {
                    System.out.println("stack is empty");
                }
                break;
            case 0:
                System.out.println("Coded by Tejas");
                break;
            default:
                System.out.println("Enter proper choice");
                break;
        }
        }while(ch!=0);
    }
}
