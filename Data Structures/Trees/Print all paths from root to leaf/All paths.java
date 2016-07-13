package javaapplication1;
 
public class JavaApplication1 {
    
    static Node root;
    void printPaths(Node node)
    {
        int path[] = new int[1000];
        printPathsRecur(node,path,0);
    }
    void printPathsRecur(Node node, int path[], int length){
     if(node==null) return;
     
     path[length]=node.data;
     length++;
     
     if(node.left == null && node.right == null)
     {
         printArray(path,length);
     }
     else
     {
         printPathsRecur(node.left,path,length);
         printPathsRecur(node.right,path,length);
     }
    }
     void printArray(int[] path, int length) {
        for(int i=0;i<length;i++)
        {
            System.out.print(path[i]+ " ");
            
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
       
        JavaApplication1 tree = new JavaApplication1();
        tree.root=new Node(10);
        root.left= new Node(8);
        root.left.left=new Node(3);
        root.left.right=new Node(5);
        root.right=new Node(2);
        root.right.left=new Node(2);
        tree.printPaths(root);
        
        
    }
    
}
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
     this.data=data;
     this.left=this.right=null;
    }
}
