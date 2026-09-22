package Blind75;

public class MaximumSubarray {

    //Brute force Appraoch using 3 Loops
    public int maximumSubArrayBrute(int[] nums) {
        if(nums.length==1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum += nums[k];
                }
                maxSum= Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    //maximum sum better
    public int maximumSubArrayBetter(int[] nums) {
        int maxSum= Integer.MIN_VALUE;
        for(int i= 0;i<nums.length;i++){
            int sum = 0;
            for(int j= i;j<nums.length;j++){
                sum+=nums[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    //maximum subarray optimal
    public static int maximumSubArrayOptimal(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i= 0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }

    void main(){
        int arr[]= {-2,1,-3,4,-1,2,1,-5,4}; // answer = 6
        System.out.println("Maximum SubArray Sum by Brute Force : "+maximumSubArrayBrute(arr));
        System.out.println("Maximum SUbArray Sum by Better Appraoch : " +maximumSubArrayBetter(arr));
        System.out.println("Maximum SubArray Sum by Optimal Approach : " +maximumSubArrayOptimal(arr));
    }
}
