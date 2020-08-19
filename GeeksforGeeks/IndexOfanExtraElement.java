package com.avijitsamanta.GeeksforGeeks;

/*
Given two sorted arrays. There is only 1 difference between the arrays.
First array has one element extra added in between. Find the index of the extra element.
Input:
2 4 6 8 9 10 12
2 4 6 8 10 12
Output:
4
 */
public class IndexOfanExtraElement {
    private int findExtra(int[] a, int[] b, int n) {
        int index = n-1;

        // left and right are end
        // points denoting the current range.
        int left = 0, right = n - 2;
        while (left <= right)
        {
            int mid = (left+right) / 2;

            // If middle element is same
            // of both arrays, it means
            // that extra element is after
            // mid so we update left to mid+1
            if (b[mid] == a[mid])
                left = mid + 1;

                // If middle element is different
                // of the arrays, it means that
                // the index we are searching for
                // is either mid, or before mid.
                // Hence we update right to mid-1.
            else
            {
                index = mid;
                right = mid - 1;
            }
        }

        // when right is greater than
        // left, our search is complete.
        return index;
    }

    public static void main(String[] args) {
        IndexOfanExtraElement obj = new IndexOfanExtraElement();
        int[] a = {2, 4, 6, 8, 9, 10, 12};
        int[] b = {2, 4, 6, 8, 10, 12};
        System.out.println(obj.findExtra(a, b, a.length));
    }
}
