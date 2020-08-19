package com.avijitsamanta.LeetCode30DaysChallengeApril2020;

import java.util.Stack;

public class MinStack {

     Stack<Integer> stack; 
    Integer minVal; 
    
    public MinStack() {
        stack=new Stack<Integer>();
    }
    
    public void push(Integer x) {
        if (stack.isEmpty()) 
        { 
            minVal = x; 
            stack.push(x); 
            return; 
        } 
        
         if (x < minVal) 
        { 
            stack.push(2*x - minVal); 
            minVal = x; 
        } 
  
        else
            stack.push(x); 
    }
    
    public void pop() {
        Integer t=stack.pop();
        
        if(t<minVal)
            minVal = 2*minVal - t; 
            
    }
    
    public int top() {
        Integer t=stack.peek();
        if(t<minVal)
            return minVal;
        return t;
    }
    
    public int getMin() {
        return minVal;
    }
    public static void main(String[] args) {
        
    }
}