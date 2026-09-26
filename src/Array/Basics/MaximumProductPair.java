package Array.Basics;

public class MaximumProductPair {
    public static int maxProduct(int arr[]) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i : arr) {
            if (max1 < i) {
                max2 = max1;
                max1 = i;
            } else if (max2 < i) {
                max2 = i;
            }

            if (min1 > i) {
                min2 = min1;
                min1 = i;
            } else if (min2 > i) {
                min2 = i;
            }

        }
        return Math.max(max1 * max2, min1 * min2);
    }
        public static void main(String args[]){
            int arr[] = {1,23,56,2,7,9,54,3};
            System.out.println(maxProduct(arr));
    }
}
