package day2;
import java.util.*;

public class QueueUsingLinkList {

    Node front,rear;
    void createQueue()
    {
        front=rear=null;
    }
    void Enqueue(int e)
    {
        Node n=new Node(e);//node created
        if(front==null)//no root
        {
            front=rear=n;
        }
        else
        {
            rear.next=n;
            rear=n;
        }
    }
    void Dequeue()
    {
        if(front==null)//no root
            System.out.println("Empty Queue");
        else
        {
            Node t=front;
            if(front==rear)
            {front=rear=null;}
            else
            {
                front=front.next;
                System.out.println("Dequeued:"+t.data);
            }
        }
    }
    void printQueue()
    {
        if(front==null)//no root
            System.out.println("Empty Queue");
        else
        {
            Node t=front;
            while(t!=null)
            {
                System.out.print("|"+t.data+"|--");
                t=t.next;
            }
        }
    }
    public static void main(String args[])
    {
        int choice;
        QueueUsingLinkList   obj=new QueueUsingLinkList();
        Scanner in=new Scanner(System.in);
        obj.createQueue();
        do
        {
            System.out.print("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit:\n");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter element:");
                    int e=in.nextInt();
                    obj.Enqueue(e);
                    break;
                case 2:
                    obj.Dequeue();
                    break;
                case 3:
                    obj.printQueue();
                    break;
                case 0:
                    System.out.print("Coded by amar");
                    break;
                default:
                    System.out.print("Wrong input:");
                    break;
            }
        }while(choice!=0);

    }
}