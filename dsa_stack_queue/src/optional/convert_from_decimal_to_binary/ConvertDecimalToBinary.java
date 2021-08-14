package optional.convert_from_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Enter decimal: ");
        int decimal = new Scanner(System.in).nextInt();

        while (true){
            stack.push(decimal%2);
            decimal = (int) (decimal/2);
            if (decimal==0)
                break;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
