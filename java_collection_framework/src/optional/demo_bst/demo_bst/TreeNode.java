package optional.demo_bst.demo_bst;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }

    public void display(){
        String print = "";
        if (this != null)
            print += "Value node: " + this.element;
        if (this.right!= null)
            print += " Sub right value: " + this.right.element;
        if (this.left != null)
            print += " Sub left value: " + this.left.element;

        System.out.println(print + "\n");
    }
}

