package com.avijitsamanta.DataStructure;

public class MyNode<E> {
    public E data;
    public MyNode<E> left, right, next;
    private MyNode<E> head = null;

    public MyNode() {
    }

    public MyNode(E data) {
        this.data = data;
        this.left = this.right = this.next = null;
    }

    public void add(E data) {
        head = insert(head, data);
    }

    private MyNode<E> insert(MyNode<E> hh, E data) {
        if (hh == null)
            return new MyNode<>(data);
        if (hh.next == null)
            hh.next = new MyNode<>(data);
        else
            insert(hh.next, data);
        return hh;
    }

    public void display() {
        MyNode<E> myNode = head;
        while (myNode != null) {
            System.out.print(myNode.data + " ");
            myNode = myNode.next;
        }
        System.out.println();
    }
}
