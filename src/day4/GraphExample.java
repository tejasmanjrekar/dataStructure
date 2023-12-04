package day4;

import java.util.Scanner;

public class GraphExample {
    int g[][], vnodes, vlist[]; //v- nodes number of nodes
    //visit number of list visited 1 / not visited 0

    void createGraph(int v) {
        vnodes = v;
        Scanner sc = new Scanner(System.in);
        g = new int[vnodes][vnodes];
        vlist = new int[vnodes];
        for (int scr = 0; scr < vnodes; scr++) {

            for (int dest = 0; dest < vnodes; dest++) {
                System.out.println("Enter cost for v" + scr + "to v" + dest + ":");
                g[scr][dest] = sc.nextInt();
            }
        }
    }
    void reset(){
    for (int i=0;i<vnodes;i++){
        vlist[i]=0;
        }
    }
    void DFS(int source){
    vlist[source]=1;
        System.out.print("V"+source+"-");
        for(int i=0;i<vnodes;i++){ //to search
            if(g[source][i]==1 && vlist[i]==0){
                //neighbour        unvisited
              vlist[i]=1;
              DFS(i);
            }
        }
    }
    void BFS(int source){
        int q[]=new int[vnodes];
        int front=0,rear=-1;
        vlist[source]=1;
        q[++rear]=source; //enqueue
        while(front<=rear){ //not empty
            int element=q[front++]; //dequeue
            System.out.print("V"+element+"-");
            for(int i=0;i<vnodes;i++){ //to search
                if(g[source][i]==1 && vlist[i]==0){
                    //neighbour        unvisited
                    vlist[i]=1; //mark visited
                    q[++rear]=i; //enqueue
                }
            }
        }
    }
    void print() {
        for (int scr = 0; scr < vnodes; scr++) {
            for (int dest = 0; dest < vnodes; dest++) {
                System.out.print(g[scr][dest]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        GraphExample ge=new GraphExample();
        ge.createGraph(4);
        ge.print();
        System.out.println("BFS:");
        ge.BFS(0);

      //  ge.DFS(0);
    }
}
