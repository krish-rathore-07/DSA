package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i = 0 ;i<arr.length-1;i++){
            int minIdx = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx = j;
                }
            }
            if(minIdx!=i){
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {4,3,21,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
