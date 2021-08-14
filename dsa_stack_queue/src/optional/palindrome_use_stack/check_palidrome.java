package optional.palindrome_use_stack;

import java.util.Scanner;
import java.util.Stack;

public class check_palidrome {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String str = new Scanner(System.in).nextLine();

        String str1 = "";
        Stack stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (true){
            if (stack.isEmpty()){
                break;
            }

            str1 += stack.pop();
        }

        System.out.println(str1);

        if (str.equals(str1))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
