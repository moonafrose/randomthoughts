public class MiddleLinkedList {
    private Node head;
    public MiddleLinkedList(){
        head=null;
    }
    void printMiddle(){
        Node slow_ptr, fast_ptr;
        if(head==null) return;
        slow_ptr=fast_ptr=head;
        while(fast_ptr!=null && fast_ptr.Next()!=null){
            slow_ptr=slow_ptr.Next();
            fast_ptr=fast_ptr.Next().Next();
        }
        System.out.println("Middle element is :"+ slow_ptr.Data());
    }
    void AddElement(int d){
        Node temp = new Node(d);

        if(head==null){
            head=temp;
        }
        else{
            Node current=head;
            Node prev=current;
            while(current!=null)
            {
                prev=current;
                current=current.Next();

            }
            prev.setNext(temp);
        }
    }
    void printList(){
        if(head==null)return;
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.Data()+ "->");
            current=current.Next();
        }
    }
    public static void main(String[] args){
        MiddleLinkedList m = new MiddleLinkedList();
       for(int i=0;i<6;i++){
           m.AddElement(i);
           m.printList();
           m.printMiddle();
           System.out.println("------------");
       }

    }
}
class Node{
    private int data;
    private Node next;
    public Node(int d){
        data=d;
        next=null;
    }
    public Node Next(){
        return this.next;
    }
    public void setNext(Node v){
         this.next=v;
    }

    public int Data() {
        return this.data;
    }
}
