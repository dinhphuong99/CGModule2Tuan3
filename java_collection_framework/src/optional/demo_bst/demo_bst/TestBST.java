package optional.demo_bst.demo_bst;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(10);
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);
        tree.insert(14);
        tree.insert(12);
        tree.insert(18);
        tree.insert(16);
        //traverse tree
        System.out.println("Postorder (sorted): ");
        tree.preorder();

        System.out.println("Delete :");
        tree.delete(4);
        //tree.insert(15);
        System.out.println("Preoder: ");
        tree.preorder();

        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
