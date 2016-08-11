public class StackX {
    private int[] stackarr;
    private int top;
    private int maxSize;

    public StackX(int n) {
        maxSize=n;
        stackarr = new int[maxSize];
        top = -1; //no. of items left
    }
    private void push(int n){
          stackarr[++top]=n;
    }
    private int pop(){
          return stackarr[top--];

    }
    private boolean isStackFull(){
        return (top==maxSize-1);
    }
    private boolean isStackEmpty(){
        return (top==-1);
    }
    private int peek(){
        return stackarr[top];
    }
    public static void main(String[] args){
        StackX stx = new StackX(10);
        stx.push(1);
        stx.push(2);
        stx.push(3);
        System.out.println("Popped element=>"+ stx.pop());

    }
}