package day2;

import java.util.Scanner;

public class CircularQueueExample {
    int queue[],maxSize;
    int rear;
    int front,count;
    void createQueue(int size){
        queue =new int[size];
        maxSize=size;
        rear =-1;
        front =0;
        count=0;
    }
    void enqueue(int e){
        rear=(rear+1)%maxSize;
        queue[rear]=e;
        count++;
    }

    int dequeue(){

        int deque=queue[front];
        front=(front+1)%maxSize; //incrementing front on dequque
        count--;
        return deque;


    }
    boolean isFull() {
    if(count==maxSize){
        return true;
    }
    else{
        return false;
    }
    }
    boolean isEmpty(){
        if(count==0){
            return true;
        }
        else {
            return false;
        }
    }
    void printQueue(){
        int i=front; //i do printing
        int c=0; // counts and stop
        while(c<count){
            System.out.println(queue[i]);
            i=(i+1)%maxSize;
            c++;
        }
    }

    public static void main(String[] args) {
        CircularQueueExample q=new CircularQueueExample();
        //System.out.println("Enter the length of array");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        q.createQueue(size);
        //int length=sc.nextInt();
        // System.out.println("Enter the number of elements of stack");
//        for(int counter=0;counter<length;counter++){
//
//        }
        int ch;
        do{
            System.out.println("Enter the choice");
            System.out.println("\n 1.Enqueue \n 2.Dequeue \n 3.Print \n0.Exit");
            ch=sc.nextInt();
            switch (ch) {

                case 1:
                    if (q.isFull() != true) {
                        System.out.println("Enter element");
                        int e = sc.nextInt();
                        q.enqueue(e);
                    } else {
                        System.out.println("Queue is full");
                    }
                    break;
                case 2:
                    if (q.isEmpty() != true) {
                        System.out.println("Element dequeued" + q.dequeue());
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;

                case 3:
                    if (q.isEmpty() != true) {
                        System.out.println("Queue is:");
                        q.printQueue();
                    } else {
                        System.out.println("Queue is empty");
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
