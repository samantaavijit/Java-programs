package com.avijitsamanta.competitiveProgramming.LeedCode;

/*
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
*/
public class ReplaceElementswithGreatestElementonRightSide {

    private int[] replaceElements(int[] arr) {
        int[] newElements = new int[arr.length];
        int maxValue = -1;
        for (int j = arr.length-1; j >=0; j--) {
            newElements[j] = maxValue;
            maxValue = Math.max(arr[j], maxValue);
        }
    
        return newElements;
    }

    public static void main(String[] args) {
        ReplaceElementswithGreatestElementonRightSide obj=new ReplaceElementswithGreatestElementonRightSide();
        int [] arr={17,18,10,4,6,1};
        int res[]=obj.replaceElements(arr);
        for(int a:res)
        System.out.print(a+" ");
    }
}