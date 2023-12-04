package practice;

public class Queue {

    private int arr[];
    private int size;

    int rear=-1;

    int front =-1;
    Queue(int n){
        arr=new int[n];
        this.size=n;
    }

    boolean isEmpty(){
//        return rear == -1; for normal queue
        return rear==-1 && front==-1; //for circular queue
    }

    boolean isFull(){
        return (rear+1)%size==front;
    }
    //enqueue
    void addQueue(int data){
       // if(rear == size-1){
        if(isFull()){
            System.out.println("full queue");
        return;
        }
//        rear ++;  for normal queue
//        arr[rear]=data; for normal queue
        if(front ==-1){
            front =0;
        }
        rear=(rear+1)%size; //for circular queue
        arr[rear]=data; //for circular queue
    }

    //dequeue
    int removeQueue(){
        if(isEmpty()){
            System.out.println("empty queue");
        return -1;
        }
        int result=arr[front];
//        for(int counter=0;counter<rear;counter++){   for normal queue
//            arr[counter]=arr[counter+1]; //to move queue ahead after removing one element
//        }
        if(rear == front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        //rear--;  for normal queue
       // return front; for normal queue
        return result;
    }
    int peak(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
    return arr[front];
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);

        q.addQueue(1);
        q.addQueue(2);
        q.addQueue(45);
        q.addQueue(5);
        q.addQueue(42);
        System.out.println("removed:"+q.removeQueue());
        q.addQueue(77);
        System.out.println("removed:"+q.removeQueue());
        q.addQueue(51);
        while(!q.isEmpty()) {
            System.out.println(q.peak());
            q.removeQueue();
        }
      //  System.out.println("Peak of queue is:"+queue.peak());
    }
}
