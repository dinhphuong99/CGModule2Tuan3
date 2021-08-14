package optional.stack_use_array;

public class StackUseArrayTest {
    public static void main(String[] args) {
        StackUseArray stackUseArray = new StackUseArray(5);
        stackUseArray.push(5);
        stackUseArray.push(2);
        stackUseArray.push(3);
        stackUseArray.push(4);
        stackUseArray.push(1);

        System.out.println(stackUseArray.isFull());

        System.out.println(stackUseArray.pop());
        System.out.println(stackUseArray.pop());
        System.out.println(stackUseArray.pop());
        stackUseArray.push(4);
    }
}
