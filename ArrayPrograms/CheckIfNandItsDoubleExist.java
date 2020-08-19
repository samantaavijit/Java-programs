/*
Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5
*/
public class CheckIfNandItsDoubleExist {

    private boolean checkIfExist(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if ((arr[j] == arr[i] * 2) || (arr[i] / 2 == arr[j] && arr[i] % 2 == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfNandItsDoubleExist obj = new CheckIfNandItsDoubleExist();
        int arr[] = { 10, 2, 5, 3 };
        System.out.println(obj.checkIfExist(arr));
    }
}