package dgfr;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class steck2 {
    public static void main(String[] args) {
   int a = 0;
   int b = 0;
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    stack1.addAll(Arrays.asList(1,-2,3,-4,5,6,-7,-8,9));
    while (stack1.empty() == false){
        if(stack1.peek()>=0){
        a = stack1.peek()+a;
        stack2.push(stack1.pop());}
        else {b = stack1.peek()+b;
            stack2.push(stack1.pop());}
    }
    b=-b;
    System.out.println(a);
    System.out.println(b);
    if (a>b){System.out.println(a>b);}
    else {System.out.println(a<=b);}
}}
