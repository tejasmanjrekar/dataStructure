package assignments;
import day3.CircularLinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        right=null;
        left=null;
    }
}
public class Assignment3 {
    Node root,last;
    void createList(){
        root=last=null;
    }
    void insertLeft(int e ){
        Node n=new Node(e); //node created
        if(root==null){
            root=last=n;
            last.right=root;
            root.left=last;
        }
        else{
            n.right=root;
            root.left=n;
            root=n;
            last.right=root;
            root.left=last;
        }
    }
    void insertRight(int e){
        Node n=new Node(e);
        if(root==null){
          root=last=n;
          last.right=root;
          root.left=last;
        }
        else{
            last.right=n;
            n.left=last;
            last=n;
            last.right=root;
            root.left=last;
            System.out.println("Inserted element at right");
        }
    }
    void deleteRight(){
        if(root==null)
            System.out.println("List is empty");
        else{
            Node t=last;
            if(t==root){
                root=last=null;
            }
            else{
                last=last.left;
                last.right=root;
                root.left=last;
            }
            System.out.println("Element Deleted"+t.data);
        }
    }
    void deleteLeft(){
        if(root==null)
            System.out.println("List is empty");
        else{
            Node t=root;
            if(root==last){
                root=last=null;
            }
            else{
                root=root.right;
                last.right=root;
                root.left=last;
            }
            System.out.println("Element deleted"+t.data);
        }
    }
    void printList(){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            Node t=root;
            do{
                System.out.print("|"+t.data+"-->");
                t=t.right;
            }while(t!=root);
        }
    }

    public static void main(String[] args) {
        Assignment3 assign=new Assignment3();
        Scanner sc=new Scanner(System.in);
        int ch,e;
        do{
            System.out.println("Enter the choice");
            System.out.println("\n 1.Insert Left \n 2.Insert Right  \n 3.Delete Left \n 4.Delete right \n 5.PrintList \n0.Exit");
            ch=sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.println("Enter element in list");
                    e = sc.nextInt();
                    assign.insertLeft(e);
                    break;
                case 2:
                    System.out.println("Enter element in list");
                    e = sc.nextInt();
                    assign.insertRight(e);
                    break;
                case 3:
                    assign.deleteLeft();
                    break;
                case 4:
                    assign.deleteRight();
                    break;
                case 5:
                    assign.printList();
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
