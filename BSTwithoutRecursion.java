package BinarySearchTree;

public class BSTwithoutRecursion {
    node root;

    public void insert(int data) {
        node newnode = new node(data);
        if (root == null) {
            root = newnode;
        } else {
            node current = root;
            node parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newnode;

                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newnode;


                        return;
                    }
                }

            }
        }
    }

    public void preorderTraversal(node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    /* To perform the Deletion
    search the node
    after searching perform delete operation
    -> deletion in leaf node
    -> deletion in non leaf node with one child
    -> deletion in non leaf node with 2 child

     */

    public node Delete(node root, int value) {
        if (root == null) {
            return root;
        }
        else if (value < root.data) {
            root.left = Delete(root.left, value);
        }
        else if (value > root.data) {
            root.right = Delete(root.right, value);
        }    //node with one or no child
       else if (root.left == null && root.right == null)
            root = null;
        else if (root.left == null||root.right==null) {
            node temp;
            temp=root.left==null? root.right:root.left;
            if(temp==null){
                return null;}
                else {
                    return root.left;

                }
            }

        else {
            node temp = root.right;
            while (temp.left != null) {

                temp = temp.left;
            }
            System.out.println(temp.data);

        }
        return root;
    }
}












