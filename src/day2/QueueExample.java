package day2;



import java.util.Scanner;

public class QueueExample {

    int queue[],maxSize;
    int rear;
    int front;
    void createQueue(int size){
        queue =new int[size];
        maxSize=size;
         rear =-1;
         front =0;
    }
    void enqueue(int e){
        rear++; //incrementing rear on enqueue
        queue[rear]=e;
    }

    int dequeue(){
        int deque=queue[front];
        front=front+1; //incrementing front on dequque
        return deque;

    }
    boolean isFull(){
        if(rear==maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isEmpty(){
        if(front>rear){
            return true;
        }
        else {
            return false;
        }
    }
    void printQueue(){
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        QueueExample q=new QueueExample();
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
