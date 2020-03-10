package dgfr;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class zadanie {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        while (stack1.empty() == false){

            stack2.push(stack1.pop()-a);
        }

        while (stack2.empty() == false){
            stack1.push(stack2.pop());
        }
System.out.println(stack1);
        }


}
