package com.avijitsamanta.DataStructure.Tree;

import java.util.Scanner;

public class BinarySearchTree {
    static class Node {
        int val;
        Node left, right;

        Node(int x) {
            this.val = x;
            this.right = null;
            this.left = null;
        }

    }

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    private void createNode(int x) {
        root = bst(root, x);
    }

    private Node bst(Node root, int val) {
        if (root == null) {

            return new Node(val);
        }

        if (root.val < val)
            root.right = bst(root.right, val);
        else
            root.left = bst(root.left, val);
        return root;

    }

    private void displayNode() {
        System.out.println("Inorder");
        inOrder(root);
        System.out.println("Root Left right");
        rootLeftRight(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    private void rootLeftRight(Node node) {
        if (node != null) {
            System.out.println(node.val);
            rootLeftRight(node.left);
            rootLeftRight(node.right);

        }
    }

    public static void main(String[] args) {
        BinarySearchTree obj = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.print("\n1. For Insert" + "\n2. For Display \n9. Exit \nEnter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Value ");
                    obj.createNode(sc.nextInt());
                    break;
                case 2:
                    obj.displayNode();
                    break;

            }

        } while (choice != 9);

        sc.close();
    }
}