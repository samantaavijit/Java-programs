import java.util.*;

/*
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/

public class MergeSortedArray {

    private void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0;
        for (int i = m; i < nums1.length; i++)
            nums1[i] = nums2[c++];

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        MergeSortedArray obj = new MergeSortedArray();
        int[] arr = { 1, 2, 5, 0, 0, 0, 0 };
        int[] arr2 = { 2, 8, 9, 15 };
        obj.merge(arr, 3, arr2, 4);
        for (int a : arr)
            System.out.print(a + " ");

        
    }
}