package Array.Hard;

import java.util.Arrays;
//
//You are given an integer array nums of length n and an integer target.
//
//Find three integers at distinct indices in nums such that the sum is closest to target.
//
//Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.


public class ThreeSumClosest {

    public static int threeSumClosest(int arr[],int target){
        int n= arr.length;
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(arr);
        for(int i= 0;i<arr.length-2;i++){

          //  if(i>0 && arr[i]==arr[i-1])continue;

            int start = i+1 ;
            int end = n-1;
            while(start<end){
                int sum = arr[i]+arr[start]+arr[end];

                if(diff>Math.abs(sum-target)){
                    diff= Math.abs(sum-target);
                    ans=sum;
                }

                if(sum==target) return target;

                else if(sum>target)end--;
                else start++;
            }
        }
        return ans;
    }

    void main(){
        int arr[] = {-1,2,1,-4};
        int target= 1;
        System.out.println(threeSumClosest(arr,target));
    }
}
