package day2;

import java.util.Scanner;



public class LinearLinkedList {
        Node root;
        //root is never created root is assigned
        void createList(){
            root=null;
        }
        void insertLeft(int e){
            Node n=new Node(e); //node created
            if(root==null){ //node root
                root=n;
            }
            else{
                n.next=root; //1
                root=n; // n is reference of address and we are giving it too root
            }
        }
        void deleteLeft(){
            if(root==null){  //no root
                System.out.println("Empty list");
            }
            else{
                Node t=root;
                root=root.next;
                System.out.println("Deleted"+t.data);
            }
        }
        void insertRight(int e){
            Node n=new Node(e); //node created
            if(root==null){ //node root
                root=n;
            }
            else{

                Node t=root; //1
                while(t.next!=null) //2
                    t=t.next;
                t.next=n;
                System.out.println("Inserted successfully");
            }
        }
        void deleteRight(){
        if(root==null){  //no root
            System.out.println("Empty list");
        }
        else{
            Node t=root; //1
            Node t2=t;
            while(t.next!=null){ //2
                t2=t;
                t=t.next;
            }
            if(t==root)//single node
                root=null;
            else
                t2.next=null; //3

            System.out.println("Deleted"+t.data);
        }
    }
    void printList(){
            if(root==null)
                System.out.println("Empty List");
            else{
                Node t=root;
                while(t!=null){
                    System.out.println("|"+t.data+"-->");
                    t=t.next;
                }
            }
        }
    void searchList(int key){
        if(root==null)
            System.out.println("Empty List");
        else{
            Node t=root;
            while(t!=null && t.data!=key){
                t=t.next;

            }
            if(t==null)
                System.out.println("Not found:"+key);
            else
                System.out.println("Found:"+key);
        }

    }
    void deleteKey(int key){
        if(root==null)
            System.out.println("Empty List");
        else{
            Node t=root;
            Node t2=t;
            while(t!=null && t.data!=key){
                t2=t;
                t=t.next;

            }
            if(t==null)
                System.out.println("Not found:"+key);
            else
            {
                System.out.println("Found:"+key);
                if(t==root){
                    root=root.next;
                }
                else if(t.next==null){
                    t2.next=null;
                }
                else{
                    t2.next=t.next;
                }
                System.out.println("Deleted:"+t.data);
            }

        }

    }void insertAt(int index,int e){
        Node n=new Node(e); //node created
        if(root==null){ //node root
            root=n;
        }
        else{
            Node t,t2;
            t=t2=root;
            if(index==0){
                n.next=root;
                root=n;
            }
            else{
                while(index>0){
                    t2=t;
                    t=t.next;
                    index--;
                }
                t2.next=n;
                n.next=t;
            }
//            n.next=root; //1
//            root=n; // n is reference of address and we are giving it too root
        }
    }

    public static void main(String[] args) {
        LinearLinkedList q=new LinearLinkedList();
        //System.out.println("Enter the length of array");
        Scanner sc=new Scanner(System.in);

        //int length=sc.nextInt();
        // System.out.println("Enter the number of elements of stack");
//        for(int counter=0;counter<length;counter++){
//
//        }
        int ch,e;
        do{
            System.out.println("Enter the choice");
            System.out.println("\n 1.Insert Left \n 2.Insert Right  \n 3.Delete Left \n 4. Delete right \n 5.PrintList \n6.SearchList \n7.DeleteOnKey\n8.Insert At\n0.Exit");
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
                    System.out.println("Enter element");
                    e=sc.nextInt();
                    q.searchList(e);
                    break;

                case 6:
                    q.printList();
                    break;
                case 7:
                    System.out.println("Enter element to delete");
                    e=sc.nextInt();
                    q.deleteKey(e);
                    break;
                case 8:
                    System.out.println("Enter element to Insert and its index");
                    e=sc.nextInt();
                    int ind=sc.nextInt();
                    q.insertAt(ind,e);
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
