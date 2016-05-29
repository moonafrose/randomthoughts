using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;

public class BinaryTree
{

    public Node root;
    public void printPaths(Node node)
    {
        int[] path = new int[4];
        printPathsRecur(node,path,0);
    }
     void printPathsRecur(Node node, int[] path, int length)
     {
     if(node==null) return;
     
     path[length]=node.Data;
     length++;
     
     if(node.Left == null && node.Right == null)
     {
         printArray(path,length);
     }
     else
     {
         printPathsRecur(node.Left,path,length);
         printPathsRecur(node.Right,path,length);
     }
    }
    void printArray(int[] path, int length) {
        for(int i=0;i<length;i++)
        {
            Console.Write(path[i]+ " ");
            
        }
        Console.WriteLine(" ");
    }
}
public class Node
{
    private int data;
    private Node left;
    private Node right;

    public int Data
    { get { return data; } set { data = value; } }

    public Node Left
    { get { return left; } set { left = value; } }

    public Node Right
    { get { return right; } set { right = value; } }

    public Node(int d)
    {
        this.data = d;
        this.right = this.left = null;

    }


}