package com.avijitsamanta.DataStructure.Tree;

public class HeightOfABinaryTree {
    static class Tree {
        Tree left, right;
        int val;

        public Tree(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private static Tree insert(Tree root, int val) {
        if (root == null)
            return new Tree(val);
        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }

    private static void display(Tree root) {
        System.out.println("In Order Left Root Right");
        inOrder(root);
        System.out.println("\nPre Order Root Left Right");
        preOrder(root);
        System.out.println("\nPost Order Left Right Root");
        postOrder(root);
    }

    private static void inOrder(Tree root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    private static void preOrder(Tree root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static void postOrder(Tree root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    private static int height(Tree root) {
        if (root == null)
            return 0;
        int ld = height(root.left);
        int rd = height(root.right);
        return Math.max(ld, rd) + 1;
    }

    public static void main(String[] args) {
        Tree root;
        root = insert(null, 15);
        root = insert(root, 10);
        root = insert(root, 25);
        root = insert(root, 5);

        display(root);
        System.out.println("\nHeight is " + height(root));


    }
}
