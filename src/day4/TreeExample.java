package day4;

public class TreeExample {
    static int counter;
    Node root;
    void createTree(){
        root=null;
    }
    void insert(Node r,Node n){
        if(root==null){
            root=n;
        }
        else{
            if(n.data<r.data){
                if(r.left==null){
                    r.left=n;
                }
                else{
                    insert(r.left,n);
                }
            }
            else{
                if(r.right==null){
                    r.right=n;
                }
                else{
                    insert(r.right,n);
                }
            }
        }
    }
    void inorder(Node r){
        if(r!=null){
            inorder(r.left);
            System.out.print(r.data+"-");
            inorder(r.right);
        }
    }
    void count(Node r){
        if(r!=null){
            count(r.left);
            TreeExample.counter++;
            count(r.right);
        }
    }
    void countLeaf(Node r){
        if(r!=null){
            countLeaf(r.left);
            if(r.left==null && r.right==null)
                TreeExample.counter++;
            countLeaf(r.right);
        }
    }
    public static void main(String[] args) {
        TreeExample te=new TreeExample();
        te.createTree();
        Node n1=new Node(50);
        te.insert(te.root,n1);
        Node n2=new Node(10);
        te.insert(te.root,n2);
        Node n3=new Node(5);
        te.insert(te.root,n3);
        Node n4=new Node(60);
        te.insert(te.root,n4);
        Node n5=new Node(69);
        te.insert(te.root,n5);
        System.out.println("Inorder");
        te.inorder(te.root);

//        te.count(te.root);
//        System.out.println("total number of nodes are:"+TreeExample.counter);
        System.out.println("\n");
        te.countLeaf(te.root);
        System.out.println("total number of leaf nodes are:"+TreeExample.counter);

    }
}
