public class StackUsingLinkedList<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();
    private void push(T value){
        linkedList.insert(value);
    }
    private void pop(){
        if(!linkedList.isEmpty())
           linkedList.remove();
        else {
            System.out.println("Stack empty ");return;
        }
    }
    private void display(){
        if(!linkedList.isEmpty())
         linkedList.display();
        else {
            System.out.println("Stack empty ");return;
        }
    }
    public static void main(String[] args){
        StackUsingLinkedList<String> stackUsingLinkedList = new StackUsingLinkedList<>();

        stackUsingLinkedList.push("1");
        stackUsingLinkedList.push("2");
        stackUsingLinkedList.display();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.display();

    }
}
class Node<T>{
    T item;
    Node<T> next;
    public Node(T item){
        this.item=item;
        this.next=null;
    }
}

class LinkedList<T>{
    private Node<T> head;
    public LinkedList(){
        head=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void insert(T value){
        Node<T> newnode = new Node<T>(value);
        newnode.next=head;
        head=newnode;
    }
    public void remove(){
        head=head.next;
    }
    public void display(){
        Node<T> current=head;
        while(current!=null){
            System.out.print(current.item+ " ");
            current=current.next;
        }
    }
}