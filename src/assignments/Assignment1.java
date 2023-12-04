package assignments;

import java.util.Scanner;

public class Assignment1 {
    char stack[];
    int tos,maxSize;

    void createStack(int size){
        stack=new char[size];
        maxSize=size;
        tos=-1;
    }
    void push(char e){
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
    char pop(){
        char temp=stack[tos];
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
    char peak(){
        char peak=stack[tos];
        return peak;
    }

    public static void main(String[] args) {
        Assignment1 assign1=new Assignment1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expression");
        String str=sc.nextLine();
        assign1.createStack(str.length());
        char[]arr=str.toCharArray();
        boolean flag=false;
        for(int counter=0;counter<assign1.maxSize-1;counter++){
            if(arr[counter]=='{'||arr[counter]=='('||arr[counter]=='[') {
                assign1.push(arr[counter]);
            }
            else if(arr[counter]=='}'||arr[counter]==')'||arr[counter]==']')
                if(assign1.is_Empty()!=true){
                    char c=assign1.pop();
                }
                else{
                    flag=false;
                    break;
            }
        }
        flag= assign1.is_Empty();
        if(flag!=true)
            System.out.println("There are unmatched opening brackets");
        else
            System.out.println("All brackets are well formed");
    }

}
