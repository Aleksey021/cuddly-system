package dgfr;

import java.util.Arrays;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        int a =1;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        while (stack1.empty() == false){
            a = (stack1.peek()*a);
            stack2.push(stack1.pop());
        }
        stack1.push(a);
        while (stack2.empty() == false){
            stack1.push(stack2.pop());
        }

        System.out.println(stack1);
    }
}
