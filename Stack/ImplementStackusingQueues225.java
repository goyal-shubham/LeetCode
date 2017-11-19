package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shubham.goyal on 2/7/17.
 */
public class ImplementStackusingQueues225 {

    public class MyStack {

        Queue<Integer> myQueue;
        int size;
        /** Initialize your data structure here. */
        public MyStack() {
            myQueue = new LinkedList<>();

        }

        /** Push element x onto stack. */
        public void push(int x) {
            myQueue.add(x);
            for(int i = 0; i < myQueue.size() - 1; i++) {
                myQueue.add(myQueue.poll());
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return myQueue.poll();
        }

        /** Get the top element. */
        public int top() {
            return myQueue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return myQueue.isEmpty();
        }
    }
}
