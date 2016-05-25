using System;

public class Tree {
	
	    private Node root;
	    
	    private Node convertToDoublyLinkedList() 
        {
	        if (root == null) {
	            return null;
	        }
	
	        root = convertToDoublyLinkedList(root);
	
	         
	        while (root.getLeft() != null)
	            root = root.getLeft();
	
	        return root;
	    }
	
	    private Node convertToDoublyLinkedList(Node root) {
	        
            //Process left subtree first
            //[1].Move to the leftmost node of the left subtree 
            //[2].With that move to the rightmost node(say A)
            //[3].Set A.right to root
            //[4].Set root.left to A
	        if (root.getLeft() != null) {
	            Node left = convertToDoublyLinkedList(root.getLeft());
	            while (left.getRight() != null) {
	                left = left.getRight();
	            }
	            left.setRight(root);
	            root.setLeft(left);
	        }

            //Process right subtree next
            //[1].Move to the rightmost node of the right subtree 
            //[2].With that move to the leftmost node(say B)
            //[3].Set B.left to root
            //[4].Set root.right to B
	        if (root.getRight() != null) {
	            Node right = convertToDoublyLinkedList(root.getRight());
	            while (right.getLeft() != null) {
	                right = right.getLeft();
	            }
	            right.setLeft(root);
	            root.setRight(right);
	        }
	
	        return root;
	    }
	    
	     
	    public void createSampleTree() {
	        root = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));        
	    }
	    
	    public static void Main() {
	        Tree tree = new Tree();
	        tree.createSampleTree();
	        Node linkedList = tree.convertToDoublyLinkedList();
	        printList(linkedList);
	    }

        static void printList(Node linkedList)
        {
            Node tail=null;
            Console.WriteLine("Output:");
            while (linkedList != null)
            {
                Console.Write(linkedList.getData() + " ");
                tail = linkedList;
                linkedList = linkedList.getRight();
            }
            printListReverse(tail);

        }
        static void printListReverse(Node linkedList)
        {
            Console.WriteLine("Output:");
            while (linkedList != null)
            {
                Console.Write(linkedList.getData() + " ");
                linkedList = linkedList.getLeft();
            }
        }
}

class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
	        this.right = right;
	    }
	}