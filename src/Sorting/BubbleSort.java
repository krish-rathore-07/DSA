package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void bubbleSortOptimal(int arr[]){
        boolean flag = false;
        for(int i = 0 ;i<arr.length-1;i++){
            for(int j = 0 ;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                IO.println("optimal approach works!!!!");
                return;
            }
        }
    }
//    public static void SortFunction(int arr[] ){
//
//    }
//
//    public static void bubbleSortRecursive(int arr[],int start,int end){
//        if(start>=end)return;
//        SortFunction(arr,0,)
//    }

    void main(){
        int arr[] = {1,2,3,4,5,6,7,4};
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
        bubbleSortOptimal(arr);
        IO.println(Arrays.toString(arr));
    }
}
