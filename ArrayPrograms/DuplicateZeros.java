/*
Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
*/
public class DuplicateZeros {

    private void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] == 0) {
                res[count++] = 0;
                res[count++] = 0;
            } else
                res[count++] = arr[i];
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        DuplicateZeros obj = new DuplicateZeros();
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        obj.duplicateZeros(arr);
    }
}