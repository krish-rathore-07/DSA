package Array_Basics;

import java.util.ArrayList;

public class Rotate_Array {
    // Rotate array by one place
    public static void rotateArrayByOne(int arr[]){
        int value = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=value;
    }

    // Rotate array by d places
    public static void rotateArray(int arr[] , int d){
        int n = arr.length;
        d = d%n;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<d;i++){
          list.add(arr[i]);
        }
        for(int i = d;i<n;i++){
            arr[i-d]= arr[i];
        }
        for(int i = 0 ;i<list.size();i++){
            arr[n-d+i]=list.get(i);
        }
    }

    // Rotate array by d places - Optimal Approach
    public static void rotate_Array(int arr[],int d){
        int n = arr.length;
        d=d%n;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    // Reverse an Array
    public static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // printing an Array
    public static void printArray(int arr[]){
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    void main(){
        int arr[] = {1,2,3,4,5,6,7};
//        rotateArrayByOne(arr);
        rotateArray(arr,5);
        printArray(arr);
    }
}
