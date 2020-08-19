public class ValidMountainArray {

    private boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i + 1 < N && A[i] < A[i + 1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N - 1)
            return false;

        // walk down
        while (i + 1 < N && A[i] > A[i + 1])
            i++;

        return i == N - 1;
    }

    public static void main(String[] args) {
        ValidMountainArray obj = new ValidMountainArray();
        int A[] = { 3, 5, 5 };
        System.out.println(obj.validMountainArray(A));
    }
}