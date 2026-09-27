package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that: 0 <= a, b, c, d < n
//a, b, c, and d are distinct.
//nums[a] + nums[b] + nums[c] + nums[d] == target
//You may return the answer in any order.


public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate j
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i]
                            + nums[j]
                            + nums[left]
                            + nums[right];

                    if (sum == target) {

                        result.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                        // Skip duplicate left values
                        while (left < right &&
                                nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate right values
                        while (left < right &&
                                nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    void main(){
        int arr[] = {1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0));
    }
}
