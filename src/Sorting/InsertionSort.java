package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i = 1 ;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev>=0 && curr<arr[prev]){
                int temp = curr;
                curr= arr[prev];
                arr[prev] = temp;
                prev--;
            }

        }
    }

    void main(){
        int arr[] = {4,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
