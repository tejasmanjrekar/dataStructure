package day3;

import day2.LinearLinkedList;


import java.util.Scanner;

public class CircularLinkedList {
    Node root,last;
    //root is never created root is assigned
    void createList(){

        last=root=null;
    }
    void insertLeft(int e){
        Node n=new Node(e); //node created
        if(root==null){ //node root
            root=last=n;
            last.next=root;
        }
        else{
            n.next=root; //1
            root=n; // n is reference of address and we are giving it too root
             last.next=root;
        }
    }
    void deleteLeft(){
        if(root==null){  //no root
            System.out.println("Empty list");
        }
        else{
            Node t=root;
            if(root==last){
                root=last=null;
            }
            else {
                root = root.next;
                last.next = root;
            }
            System.out.println("Deleted"+t.data);
        }
    }
    void insertRight(int e){
        Node n=new Node(e); //node created
        if(root==null){ //node root
            root=n;
        }
        else{

            last.next=n; //adding last
            last=n; //shifting last
            last.next=root; //linking to root
        }
    }
    void deleteRight(){
        if(root==null){  //no root
            System.out.println("Empty list");
        }
        else{
            Node t=root; //1
            Node t2=t;
            while(t!=last){ //2
                t2=t;
                t=t.next;
            }
            if(t==root)//single node
            {
                root=last=null;
            }
            else
            {
                last=t2;
                last.next=root;
            }
            System.out.println("Deleted"+t.data);
        }
    }
    void printList(){
        if(root==null)
            System.out.println("Empty List");
        else{
            Node t=root;
           do{
                System.out.println("|"+t.data+"-->");
                t=t.next;
            }while(t!=root);
        }
    }



    public static void main(String[] args) {
        CircularLinkedList q=new CircularLinkedList();
        Scanner sc=new Scanner(System.in);
        int ch,e;
        do{
            System.out.println("Enter the choice");
            System.out.println("\n 1.Insert Left \n 2.Insert Right  \n 3.Delete Left \n 4. Delete right \n 5.PrintList \n0.Exit");
            ch=sc.nextInt();
            switch (ch) {

                case 1:

                    System.out.println("Enter element");
                    e = sc.nextInt();
                    q.insertLeft(e);
                    break;
                case 2:

                    System.out.println("Enter element");
                    e = sc.nextInt();
                    q.insertRight(e);
                    break;

                case 3:
                    q.deleteLeft();
                    break;

                case 4:
                    q.deleteRight();
                    break;

                case 5:
                    q.printList();
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
