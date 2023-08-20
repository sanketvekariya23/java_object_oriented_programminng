import java.util.*;
public class collection_queue
{
    public static void main(String[] args){
        LinkedList q = new LinkedList<>();
        q.offer("sanket");
        q.offer("ravi");
        q.offer(101);
        q.offer("raj");
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
    }    
}