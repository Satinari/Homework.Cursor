package homework5.Advanced;

public class Main {
    public static void main(String args[])
    {
        //LinkedListStack
        LinkedListStack<Integer> lls=new LinkedListStack<>();
        lls.push(20);
        lls.push(50);
        lls.push(80);
        lls.push(40);
        lls.push(60);
        lls.push(75);
        System.out.println(lls.toString());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        System.out.println(lls.toString());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        System.out.println(lls.toString());
        lls.push(10);
        System.out.println("Element removed from LinkedList: "+lls.pop());
        System.out.println(lls.toString());

        //LinkedListQueue
        System.out.println("\n");
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        System.out.println("LinkedListQueue: ");
        System.out.println(queue.toString());
        queue.enqueue(6);
        System.out.println(queue.toString());
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
        System.out.println(queue.toString());
        queue.dequeue();
        queue.enqueue(43);
        System.out.println(queue.toString());
        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(77);
        System.out.println(queue.toString());
        queue.dequeue();
        queue.enqueue(32);
        queue.enqueue(232);
        System.out.println(queue.toString());
    }
}