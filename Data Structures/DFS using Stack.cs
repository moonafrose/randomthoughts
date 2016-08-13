using System;
using System.Collections.Generic;

public class Tree
{
    private Node root;
    public Tree()
    {
        root = null;
    }

    public void PrintDepth()
    {
        Stack<Node> stack = new Stack<Node>();
        if (root != null) queue.Push(root); else return;
        while (queue.Count > 0)
        {
            Node temp = stack.Pop();
            if (temp.Right != null) stack.Push(temp.Right);
            if (temp.Left != null) stack.Push(temp.Left);         
            Console.Write(temp.Data + " ");
        }

    }

    public static void Main()
    {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.Left = new Node(2);
        tree.root.Right = new Node(3);
        tree.root.Left.Right = new Node(4);
        tree.root.Right.Left = new Node(5);
        tree.PrintLevelOrder();
        Console.ReadKey();
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



