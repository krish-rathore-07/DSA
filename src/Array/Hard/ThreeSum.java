package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // If the smallest number is > 0,
            // sum can never be 0
            if (nums[i] > 0) {
                break;
            }

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {

                int sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {

                    list.add(Arrays.asList(
                            nums[i],
                            nums[start],
                            nums[end]
                    ));

                    start++;
                    end--;

                    // Skip duplicates
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }

                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return list;
    }

    void main(){
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
