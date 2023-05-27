class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
        left=null;
        right=null;
    }
}
class BinaryTree<T>{
    private Node<T> root;

    BinaryTree() {
        root = null;
    }
    private Node<T> insertNode(Node<T> node, T data){
        if (node == null){
            return new Node<T>(data);
        }

        if (data.toString().compareTo(node.data.toString()) <= 0) {
            node.left = insertNode(node.left, data);
        }else {
            node.right = insertNode(node.right, data);
        }

        return node;
    }
    void insert(T data){
        root = insertNode(root, data);
    }
    private void preorderTraversal(Node<T> node) {
        if (node != null) {
            System.out.print(node.data+ " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
    private void inorderTraversal(Node<T> node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data+ " ");
            inorderTraversal(node.right);
        }
    }
    private void postorderTraversal(Node<T> node){
        if (node !=null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data+" ");
        }
    }
    void preorder(){
        System.out.print("Preorder Traversal: ");
        preorderTraversal(root);
        System.out.println();
    }
    void inorder(){
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }
    void postorder(){
        System.out.print("Postorder Traversal: ");
        postorderTraversal(root);
        System.out.println();
    }
}



