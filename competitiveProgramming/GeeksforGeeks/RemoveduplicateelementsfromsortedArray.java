package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

public class RemoveduplicateelementsfromsortedArray {
    
    public int removeDuplicates(int[] nums) {

        if(nums.length==0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        for (int j : nums) {
            System.out.print(j+" ");
        }
        return i + 1;
    }
    public static void main(String[] args) {
        RemoveduplicateelementsfromsortedArray obj=new RemoveduplicateelementsfromsortedArray();
        int[] nums ={1,1,2,2,2,3,4,4,4,5,9};
        obj.removeDuplicates(nums);

        
    }
}