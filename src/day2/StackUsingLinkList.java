package day2;

import java.util.Scanner;


public class StackUsingLinkList {
    Node tos;
    void createStack(){
        tos=null;
    }
    void push(int e){
        Node n=new Node(e); //node created
        if(tos==null){ //node root
            tos=n;
        }
        else{
            n.next=tos; //1
            tos=n; // n is reference of address and we are giving it too root
        }
    }
    void pop(){
        if(tos==null){  //no root
            System.out.println("Empty list");
        }
        else{
            Node t=tos;
            tos=tos.next;
            System.out.println("Poped:"+t.data);
        }
    }
    void printStack(){
        if(tos==null)
            System.out.println("Empty Stack");
        else{
            Node t=tos;
            while(t!=null){
                System.out.println("|"+t.data+"-->");
                t=t.next;
            }
        }
    }
    void peek(){
        if(tos==null)
            System.out.println("Empty Stack");
        else{
            System.out.println("Element at peek:"+tos.data);
            }
    }
    public static void main(String args[])
    {
        int choice;
        StackUsingLinkList  obj=new StackUsingLinkList ();
        Scanner in=new Scanner(System.in);
        obj.createStack();
        do
        {
            System.out.print("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit:");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter element:");
                    int e=in.nextInt();
                    obj.push(e);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.printStack();
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
