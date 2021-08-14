package optional.check_brackets;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    static Stack stack = new Stack();

    public static boolean ivalidBacket(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ')' && stack.isEmpty()){
                return false;
            }

            if (c == ')' && !stack.isEmpty()){
                stack.pop();
            }
        }

        if (stack.isEmpty()){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '('){
                stack.push(c);
            }
        }

        if (ivalidBacket(str))
            System.out.println("Bakets valid");
        else
            System.out.println("Bakets invalid");
    }
}
