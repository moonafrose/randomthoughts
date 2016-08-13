import java.util.Stack;

public class BST {
    private Node root;

    public void insert(int data) {
        Node newnode = new Node(data); //I can always create a new node
        if (root == null) //tree doesn't exist at this point
            root = newnode;
        else {
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current; /* hv to remember parent since current will point to null at some point of time */
                if (data < current.getData()) { //go left side
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newnode);
                        return; /* necessary since while is set to indefinitely true. */
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newnode);
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraversalRecursive(Node root) {
        if (root == null) return;
        inOrderTraversalRecursive(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrderTraversalRecursive(root.getRight());
    }

    public void inOrderTraversalIterative(Node root) {
        if (root == null) return;
        Stack<Node> mystack = new Stack<>();
        while (root != null) {
            mystack.push(root);
            root = root.getLeft();
        }
        while (!mystack.isEmpty()) {
            Node temp = mystack.pop();
            System.out.print(temp.getData() + " ");
            temp = temp.getRight();
            while (temp != null) {
                mystack.push(temp);
                temp = temp.getLeft();
            }
        }
    }

    public Boolean find(int data) {
        if (root == null) return false;
        Node current = root;
        while (current.getData() != data) {
            if (data < current.getData()) {
                current = current.getLeft();

            } else {
                current = current.getRight();
            }
            if (current == null) return false;
        }
        return true;
    }

    public void delete(int data) {
        if (root == null) return;
        boolean isLeftChild = false;
        Node current = root;
        Node parent = root;
        while (current.getData() != data) {
            parent = current;
            if (data < current.getData()) {
                isLeftChild = true;
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            if (current == null) return;

        }
        /*Case 1: Node to be deleted is a leaf node. So we set its parent to null*/
        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root)
                root = null;
            else {
                if (isLeftChild) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            }
        }
        /*--------End of case 1*---------------------------*/
        /*Case 2: Node to be deleted has a single child(Either left or right)
         * If node has no left child, replace parent with its right subtree
        * */
        else if(current.getLeft()==null){
            if(current==root)
                root=current.getRight();
            else if(isLeftChild)
                parent.setLeft(current.getRight());
            else parent.setRight(current.getRight());
        }
        else if(current.getRight()==null){
            if(current==root)
                root=current.getLeft();
            else if(isLeftChild)
                parent.setLeft(current.getLeft());
            else parent.setRight(current.getLeft());
        }
        /* --------End of case 2*--------------------------- */

        //To do: Case 3

    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(40);
        tree.insert(2);
        tree.insert(1);
        tree.insert(66);
        tree.insert(100);
        tree.insert(0);
        tree.inOrderTraversalIterative(tree.root);
        System.out.println();
        System.out.println("Is 9 present? " + tree.find(9));
        tree.delete(0);
        tree.inOrderTraversalIterative(tree.root);

    }
}

class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public void setRight(Node n) {
        right = n;
    }
}
