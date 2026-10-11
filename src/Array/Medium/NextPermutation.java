package Array.Medium;

import java.util.Arrays;

public class NextPermutation {

    public static void reverse(int arr[] ,int start, int end ){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void nextPermutation(int arr[]){
        int breakIdx = -1;
        int n= arr.length;
        for(int i = n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                breakIdx=i-1;
                break;
            }
        }
        if(breakIdx==-1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i = n-1;i>breakIdx;i--){
            if(arr[i]>arr[breakIdx]){
                int temp = arr[breakIdx];
                arr[breakIdx]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        reverse(arr,breakIdx+1,n-1);
    }
    void main(){
        int arr[] = {5,4,1,2};
        System.out.println(Arrays.toString(arr));
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
