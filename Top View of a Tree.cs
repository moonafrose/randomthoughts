using System;

public class BinaryTree
{
    private Node root;
    public static void Main()
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(3);
        tree.root.Left = new Node(5);
        tree.root.Left.Right = new Node(4);
        tree.root.Left.Left = new Node(1);
        tree.root.Left.Left.Right = new Node(9);

        tree.root.Right = new Node(2);
        tree.root.Right.Left = new Node(6);
        tree.root.Right.Right = new Node(7);
        tree.root.Right.Right.Left = new Node(8);
        ProcessLeft(tree.root);
        ProcessRight(tree.root.Right);
        Console.ReadKey();

    }
    public static void ProcessLeft(Node root)
    {
        if (root == null) return;

        ProcessLeft(root.Left);
        Console.Write(root.Data + " ");


    }
    public static void ProcessRight(Node root)
    {
        if (root == null) return;        
        Console.Write(root.Data + " ");
        ProcessRight(root.Right);

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

}




