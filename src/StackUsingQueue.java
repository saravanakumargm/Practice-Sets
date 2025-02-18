import java.util.PriorityQueue;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 = new PriorityQueue<>();
    Queue<Integer> q2 = new PriorityQueue<>(); 

    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q =q1;
        q1 = q2;
        q2 = q;
    }
    public Integer peek(){
        return q1.peek();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
    }
}
