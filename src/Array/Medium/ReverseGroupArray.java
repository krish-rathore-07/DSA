package Array.Medium;


// GFG - Reverse Array in Groups
//Given an integer array arr[] and an integer k, reverse every consecutive group of k elements. If fewer than k elements remain at the end, reverse all of them.

public class ReverseGroupArray {

    public static void reverse(int arr[],int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
        public static void main(String args[]){
            int arr[] = {1,2,3,4,5};
            int k = 2;
            printArr(arr);
            for(int i = 0 ;i<arr.length;i+=k){
                int start = i;
                int end = Math.min(i+k-1,arr.length-1);

                reverse(arr,start,end);
            }
            printArr(arr);
        }

}
