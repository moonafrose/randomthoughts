public class CircularLinkedList<T> {
    private Node<T> head;
    public CircularLinkedList(){
        head=null;
    }
    public Boolean isCyclePresent(Node<T> head){
        if(head==null) return true;
        Node<T> current = head.getNext();

       //current!=null will handle the case when cycle is not present and list terminates somewhere
        // current!=head will handle the cyclic case
        //if any of them is false that means current has found a cycle or current has reached an end
        while(current!=null && current!=head){
            current=current.getNext();
        }
        return (current==head);

    }

    public static void main(String[] args) {
        CircularLinkedList<Integer> c = new CircularLinkedList<>();
        c.head = new Node(2);
        c.head.setNext(new Node(5));
        c.head.getNext().setNext(new Node(7));
        c.head.getNext().getNext().setNext(new Node(8));
        c.head.getNext().getNext().getNext().setNext(new Node(10));
        c.head.getNext().getNext().getNext().getNext().setNext(c.head);  //creating a cycle
        System.out.print(c.isCyclePresent(c.head));
        //Toggle commenting line 29 and check the output

    }
}

class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data=data;
    }
    public Node<T> getNext(){
        return next;
    }
    public void setNext(Node<T> next){
        this.next=next;
    }
}
