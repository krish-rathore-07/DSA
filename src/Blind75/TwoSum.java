package Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoSum {

    public static ArrayList<Integer> twoSumBrute(int arr[],int target){
        for(int i= 0;i<arr.length;i++){

            for(int j= 0;j<arr.length;j++){
                if(i!=j && arr[i]+arr[j]==target) return new ArrayList<Integer>(List.of(i,j));
            }
        }
        return new ArrayList<>();
    }

    public static ArrayList<Integer> twoSumBetter(int arr[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0;i<arr.length;i++){
            int remaining = target-arr[i];
            if(map.containsKey(remaining)){
                return new ArrayList<>(List.of(map.get(remaining),i));
            }
            map.put(arr[i],i);
        }
        return new ArrayList<>();
    }

    //Only Applicable for the Sorted Arrays
    public static ArrayList<Integer> twoSumOptimal(int arr[],int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                return new ArrayList<>(List.of(start,end));
            }
            else if(arr[start]+arr[end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        return new ArrayList<>();
    }

    void main(){
        int arr[] = {1,2,3,4,6,7,8,9};
        System.out.println("two sum brute : "+ twoSumBrute(arr,175));
        System.out.println("two sum better : "+twoSumBetter(arr,174));
        System.out.println("Two sum optimal : "+twoSumOptimal(arr,1744));

    }
}
