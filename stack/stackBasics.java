import java.util.*;
public class stackBasics {
        private Stack <Integer> instack;
        private Stack <Integer> outstack;
        
        public stackBasics(){
            instack = new Stack<>();
            outstack = new Stack<>();
        }
//enqueue
        public void  enqueue(int x){
            instack.push(x);
        }
//dequeue
        public int dequeue(){
            shiftStacks();
            return outstack.pop();
        }

//peak
        public int peak(){
            shiftStacks();
            return outstack.peek();
        }


//transfer the data from instack to outstack

        private void shiftStacks() {
            if (outstack.isEmpty()) {
                while (!instack.isEmpty()) {
                    outstack.push(instack.pop());
                }
            }
        }
public static void main(String[] args) {

        stackBasics queue = new stackBasics();
        queue.enqueue(11);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peak());     // 10
        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println("Peek: " + queue.peak());     // 20

}
}
