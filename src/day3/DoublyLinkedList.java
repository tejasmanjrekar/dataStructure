package day3;

import java.util.Scanner;

public class DoublyLinkedList {

    Node1 left, right, root;

    //root is never created root is assigned
    void createList() {

        root = null;
    }

    void insertLeft(int e) {
        Node1 n = new Node1(e); //node created
        if (root == null) { //node root
            root = n;
        } else {
            n.right = root;
            root.left = n;
            root = n;
        }
    }

    void deleteLeft() {
        if (root == null) {  //no root
            System.out.println("Empty list");
        } else {
            Node1 t = root;
            root = root.right;
            if (root != null)
                root.left = null;
            System.out.println("Deleted" + t.data);
        }
    }

    void insertRight(int e) {
        Node1 n = new Node1(e); //node created
        if (root == null) { //node root
            root = n;
        } else {
            Node1 t = root;
            while (t.right != null)
                t = t.right;
            t.right = n;
            n.left = t;

        }
    }

    void deleteRight() {
        if (root == null) {  //no root
            System.out.println("Empty list");
        } else {
            Node1 t = root; //1
            Node1 t2;
            while (t.right != null) { //2
                t = t.right;
            }
            if (t == root)//single node
            {
                root = null;
            } else {
                t2 = t.left;
                t2.right = null;
            }
            System.out.println("Deleted" + t.data);
        }
    }

    void printList() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node1 t = root;
            while (t != null) {
                System.out.println("|" + t.data + "-->");
                t = t.right;
            }
        }
    }

    void rprintList() {
        if (root == null)//no root
            System.out.println("Empty List");
        else {
            Node1 t = root;//1
            while (t.right != null)//2 take to last
                t = t.right;
            while (t != null)//3
            {
                System.out.print("|" + t.data + "-->");
                t = t.left;
            }

        }
    }


    public static void main(String[] args) {
        DoublyLinkedList q = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch, e;
        do {
            System.out.println("Enter the choice");
            System.out.println("\n 1.Insert Left \n 2.Insert Right  \n 3.Delete Left \n 4. Delete right \n 5.PrintList \n0.Exit");
            ch = sc.nextInt();
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
                case 6:
                    q.rprintList();
                    break;
                case 0:
                    System.out.println("Coded by Tejas");
                    break;
                default:
                    System.out.println("Enter proper choice");
                    break;
            }
        } while (ch != 0);
    }
}



