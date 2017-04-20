public class Linked<T> {
 private Node<T> head;
    public Linked(){
        this.head = null;
    }
    public int getLength(){
        if(head==null)return 0;
        int length=0;
        Node<T> current = head;
        while(current!=null){
            length++;
            current = current.getNext();
        }
        return length;
    }
    public void addNode(T value){

        Node<T> newnode = new Node<T>(value);
        if(head==null){//First time
            head = newnode;
        }
        else{
            Node<T> current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(newnode);
            current=null;
        }
    }
    public void printNthLastUsingLengthMethod(int n){

        int length= getLength();
        if(n>length || n<0)
            return;
        Node<T> current = head;
        for(int i=1;i<length-n+1;i++)
            current = current.getNext();
        System.out.println();
        System.out.print(current.getItem());


    }
	public void printNthLastUsingTwoPointers(int n){
        if(head==null)return;
        Node<T> ptr1 = head;
        Node<T> ptr2 = head;

        //Make the two pointers n-1 apart
        for(int i=0;i<n-1;i++){
                ptr2 = ptr2.getNext();
            if(ptr2 ==null) return;  //to check whether ptr2 has not reached end of linked list
        }
        while(ptr2.getNext()!=null)
        {
            ptr2=ptr2.getNext();
            ptr1=ptr1.getNext();
        }
        System.out.println();
        System.out.println(ptr1.getItem());

    }
    public void printList(){
        Node<T> current = head;
        while(current!=null){
            System.out.print(current.getItem() + " ");
            current = current.getNext();
        }
    }
    public static void main(String[] args){
        Linked<Integer> linkedList = new Linked<>();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        System.out.println(linkedList.getLength());
        linkedList.printList();
        linkedList.printNthLastUsingLengthMethod(2);
		linkedList.printNthLastUsingTwoPointers(5);

    }
}

class Node<T> {
    private T item;
    private Node<T> next;
    public Node(T item) {
        this.item = item;
        this.next = null;
    }
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
    public Node<T> getNext(){
        return this.next;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }

}

