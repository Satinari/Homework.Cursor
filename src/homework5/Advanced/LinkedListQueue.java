package homework5.Advanced;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    LinkedListQueue()
    {
        queue1=new LinkedList<Integer>();
        queue2=new LinkedList<Integer>();
    }

    public void push(int i){
        if(queue1.size()==0)
            queue1.add(i);
        else{
            int sizeOfQueue1 = queue1.size();
            // Copy elements of Queue1 to Queue2
            for(int j=0 ; j<sizeOfQueue1 ; j++)
                queue2.add(queue1.remove());
            queue1.add(i);
            // Copy elements for Queue2 to Queue1
            for(int k=0 ; k<sizeOfQueue1 ; k++)
                queue1.add(queue2.remove());
        }
    }

    public int pop(){
        if(queue1.size()==0)
            throw new QueueEmptyException("Underflow Exception");
        return queue1.remove();
    }

class QueueEmptyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }
}

    @Override
    public String toString() {
        return "list is: " + queue1;
    }
}
