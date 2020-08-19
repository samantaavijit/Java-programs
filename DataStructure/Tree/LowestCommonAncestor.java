package com.avijitsamanta.DataStructure.Tree;

import com.avijitsamanta.DataStructure.MyNode;

public class LowestCommonAncestor {

//    public static Node lca(Node root, int v1, int v2) {
//        // Write your code here.
//        //Decide if you have to call rekursively
//        //Samller than both
//        if(root.data < v1 && root.data < v2){
//            return lca(root.right,v1,v2);
//        }
//        //Bigger than both
//        if(root.data > v1 && root.data > v2){
//            return lca(root.left,v1,v2);
//        }
//
//        //Else solution already found
//        return root;
//    }

    public static void main(String[] args) {

        MyNode<Integer> myNode = new MyNode<>();
        myNode.add(5);
        myNode.display();
    }
}
