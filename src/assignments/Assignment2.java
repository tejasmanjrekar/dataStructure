package assignments;

import java.util.Scanner;


public class Assignment2 {
    char stack[];
    int tos,maxSize;
    void createStack(int size){ //creating new stack
       stack=new char[size];
       maxSize=size;
       tos=-1;
    }
    void push(char str) {
        //to push char element into stack
        tos++;
        stack[tos] = str;
    }
    boolean is_Full() { //to check wheter stack is full
        if (tos == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    char pop(){ //to pock characters
        char temp=stack[tos];
        tos--;
        return temp;
            }
    boolean is_Empty(){ //to check whether stack is empty
        if(tos==-1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        Assignment2 assign=new Assignment2();

        String str=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        sc.nextLine();
        assign.createStack(size);
        if (assign.is_Full() != true) { //to check if stack is full
            System.out.println("Enter element");
             str = sc.nextLine();
            for(int i=0;i<str.length();i++) {
                assign.push(str.charAt(i));
            }
        } else {
            System.out.println("Stack is full");
        }
        if (assign.is_Empty() != true) { //to check if stack is empty
            for(int i=0;i<str.length();i++) {
                System.out.print(assign.pop());
            }
        } else {
            System.out.println("Stack is empty");
        }

}
}

