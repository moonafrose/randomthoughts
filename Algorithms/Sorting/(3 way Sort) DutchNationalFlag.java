public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1, 0, 1, 0, 2, 0, 1, 2, 1, 0, 2, 1, 1, 0, 2, 1, 0, 1};
        int i = 0, j = 0, n = arr.length - 1;
            /*i will be responsible for 0; j will be responsible for 1; n will be responsible for 2*/
        while (j < n) {
            if (arr[j] == 0) {
                swap(arr, i++, j++); //incrementing i and j since it is done with 0
            } else if (arr[j] == 1) {
                j++; //nothing to do since it is 1 and will remain in the middle
            } else {
                swap(arr, j, n--); //not incrementing j since it can be a 0 or 1 after swapping with last
            }
        }
        for (Integer v : arr)
        {
            System.out.print(v + " ");
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }
}
