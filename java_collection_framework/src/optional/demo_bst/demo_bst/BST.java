package optional.demo_bst.demo_bst;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*tạo một gốc mới*/
        else {
            /*xác định vị trí nút cha*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            /*duyệt tìm nút lá*/
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    /*chèn vào nút trái*/
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    /*chèn vào nút phải*/
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Nút trùng lặp không được chèn*/
            }
            /* tìm thành công nút lá
            * nút parent sẽ là nút là khi duyệt tìm thành công*/
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*phần tử được chèn thành công*/
    }

    public boolean delete(E e) {
// Định vị nút sẽ bị xóa và xác định vị trí nút cha của nó
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current.display();
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current.display();
                parent = current;
                current = current.right;
            } else
                break; // Phần tử cần được tìm ra trong cây được chỉ bởi nút current
        }
        if (current == null)
            return false; // Không tìm thấy nút đó
// Trường hợp 1: nút current không có nút con trái
        if (current.left == null) {
            current.display();
//Kết nối nút parent với nút con bên phải của nút current
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        } else {
// Trường hợp 2: nút current có nút con trái
// Định vị nút lá ngoài cùng bên phải trong cây con bên trái của nút current là nút rightMost
// nút parent của nó là nút parentOfRightMost
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            current.display();
            while (rightMost.right != null) {
                System.out.println("parent of right most: ");
                parentOfRightMost = rightMost;
                parentOfRightMost.display();
                rightMost = rightMost.right; // Tiếp tục đi bên phải
            }
// Thay thế phần tử current bằng phần tử bên phải rightMost
            current.element = rightMost.element;
            current.display();
// Loại bỏ nút ngoài cùng bên phải
            if (parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else
// Trường hợp đặc biệt: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
        }
        size--;
        return true; // Xoá thành công
    }

    @Override
    public int getSize() {
        return this.size;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        root.display();
        inorder(root.right);
    }

    public void preorder() {
        preorder(root);
    }

    void preorder(TreeNode<E> root) {
        if (root == null)
            return;

        root.display();
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(TreeNode<E> root)
    {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        root.display();
    }

    public void postorder() {
        postorder(root);
    }
}