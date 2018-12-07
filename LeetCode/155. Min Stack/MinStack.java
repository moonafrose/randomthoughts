import java.util.Stack;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

*/
public class MinStack {
    // Solution-I is to use two stacks. One is the mainStack and the other is the
    // minStack.
    // At any given point of time, minStack will hold minimum element till now(push
    // or popped value)
    // No of elements in either stack will be same
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty()) { // first time entry
            minStack.push(x);
        } else {
            // check which one of the two is smaller i.e., current element or top of
            // minStack and insert that
            if (x < minStack.peek()) {
                minStack.push(x);
            } else {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}