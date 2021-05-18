package BinarySearchTree;

public class BSTwithoutRecursionMain {
    public static void main(String[] args) {


        BSTwithoutRecursion obj = new BSTwithoutRecursion();

        obj.root = new node(50);
        obj.insert(30);
        obj.insert(70);
        obj.insert(20);
        obj.insert(40);
        obj.insert(60);
        obj.insert(80);
        obj.preorderTraversal(obj.root);
        System.out.println("after deletion");
        obj.Delete(obj.root, 40);
        obj.preorderTraversal(obj.root);





    }
}
