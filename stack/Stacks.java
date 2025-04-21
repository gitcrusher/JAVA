import java.util.*;

public class Stacks {
    Stack<Integer> instack = new Stack<>();
    Stack<Integer> outstack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    for(;;){
        while(!instack.empty()){
            outstack.push(outstack.pop());
        }
        instack.push(sc.nextInt());
        while(!outstack.empty()){
            instack.push(outstack.pop());
        }
    }

}
