package Array.Medium;
//
//3159. Find Occurrences of an Element in an Array
//You are given an integer array nums, an integer array queries, and an integer x.
//For each queries[i], you need to find the index of the queries[i]th occurrence of x in the nums array. If there are fewer than queries[i] occurrences of x, the answer should be -1 for that query.
//Return an integer array answer containing the answers to all queries.
//
//        Example 1:
//
//Input: nums = [1,3,1,7], queries = [1,3,2,4], x = 1
//
//Output: [0,-1,2,-1]
//
//Explanation:
//
//For the 1st query, the first occurrence of 1 is at index 0.
//For the 2nd query, there are only two occurrences of 1 in nums, so the answer is -1.
//For the 3rd query, the second occurrence of 1 is at index 2.
//For the 4th query, there are only two occurrences of 1 in nums, so the answer is -1.

import java.util.ArrayList;

public class FindOccurenceOfElement {
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        // int ans [] = new int[queries.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==x)list.add(i);
        }
        for(int i = 0;i<queries.length;i++){
            if(queries[i]<=list.size()){
                queries[i]=list.get(queries[i]-1);
            }
            else{
                queries[i]=-1;
            }
        }
        return queries;
    }

    public static void printArr(int arr[] ){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    void main(){
        int nums[] = {1,3,1,7};
        int queries[] = {1,3,2,4};
        int x = 1;
        printArr(occurrencesOfElement(nums,queries,x));
    }
}
