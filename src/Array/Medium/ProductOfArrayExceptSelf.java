package Array.Medium;

//
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf {

    public static List<Integer> bruteForce(int arr[]){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int prod =1;
            for(int j= 0;j<n;j++){
                if(i!=j){
                    prod*=arr[j];
                }
            }
            list.add(prod);
        }
        return list;
    }

    public static int[] betterSolution(int arr[]){
        //in this solution we use some auxillary arrays
        int n=arr.length;
        int ans[]  = new int [n];
        int prefix [] = new int [n];
        int sufix [] = new int[n];


        prefix[0]=1;
        sufix[n-1]=1;
        for(int i= 1;i<n;i++){
            prefix[i] = prefix[i-1]*arr[i-1];
            sufix[n-i-1] = sufix[n-i]*arr[n-i];
        }
        for(int i = 0;i<n;i++){
            ans[i] = prefix[i]*sufix[i];
        }
        return ans;
    }

    //optimal Approach
    public static int[] optimalApproach (int arr[]){
        int ans[] = new int [arr.length];
        int n= arr.length;

        ans[0]=1;
        //for calculating prefix
        for(int i =1; i<n;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i = n-2;i>=0;i--){
            suffix *= arr[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }

    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

//    public static int[] practice (int arr[]){
//        int ans[]= new int [arr.length];
//        int n= arr.length;
//        int prefix [] = new int[n];
//        int suffix [] = new int[n];
//        prefix[0]=1;
//        suffix[n-1]=1;
//        for(int i =1;i<n;i++){
//            prefix[i]=prefix[i-1]*arr[i-1];
//        }
//        for(int i=n-2;i>=0;i--){
//            suffix[i]=suffix[i+1]*arr[i+1];
//        }
//        for(int i=0;i<n;i++){
//            ans[i]=prefix[i]*suffix[i];
//        }
//        return ans;
//    }

    void main(){
        int arr[] = {1,2,3,4};
//        System.out.println(bruteForce(arr));
//        printArr(betterSolution(arr));
        printArr(optimalApproach(arr));
//        printArr(practice(arr));
    }


}

