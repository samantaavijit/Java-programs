package com.avijitsamanta.DataStructure.Stack;


public class UserDefinedStack {

    public static void main(String[] args) throws Exception {
        MyStack<Integer> arr = new MyStack<>();

        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);


        System.out.println(arr.peek());
        arr.pop();
        arr.pop();
        arr.pop();
        System.out.println(arr.pop());
        System.out.println(arr.peek());

    }
}
