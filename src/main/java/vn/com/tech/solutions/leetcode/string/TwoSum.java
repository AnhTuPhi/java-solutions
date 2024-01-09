package vn.com.tech.solutions.leetcode.string;

import org.apache.commons.lang3.time.StopWatch;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class TwoSum {


    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * <p>
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * <p>
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * <p>
     * Constraints:
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     * <p>
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */

    public static void main(String[] args) {
        var timer = new StopWatch();
        timer.start();
        var nums = new int[]{3, 2, 4};
        var target = Integer.valueOf(6);
        var result = twoSumOnePassHashTable(nums, target);
        timer.stop();
        System.out.println("solutions done within " + timer.getTime(TimeUnit.NANOSECONDS) + " nanoseconds");
        System.out.println("solutions done within " + timer.getTime(TimeUnit.MILLISECONDS) + " miliseconds");
        System.out.println("solutions done within " + timer.getTime(TimeUnit.SECONDS) + " seconds");
    }

    /**
     * Brute Force
     * around 9ms on leetcode
     * around 26ms on ubuntu laptop
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        for (var i = 0; i <= length - 1; i++) {
            for (var j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("{" + i + "," + j + "}");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Iterator nums convert to hashmap. Then iterator again to find result
     * around 0ms
     * around 59186 nanoseconds on laptop
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumTwoPassHashTable(int[] nums, int target) {
        var length = nums.length;
        Map<Integer, Integer> mapper = new HashMap<>();

        for (var i = 0; i < length; i++) {
            mapper.put(nums[i], i);
        }

        for (var i = 0; i < length; i++) {
            int complement = target - nums[i];
            if (mapper.containsKey(complement) && mapper.get(complement) != i) {
                return new int[]{i, mapper.get(complement)};
            }
        }
        return new int[]{};
    }

    /**
     * one pass hash map
     * around 0ms on leetcode
     * around 43794 nanoseconds on laptop
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumOnePassHashTable(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> mapper = new HashMap<>();

        for (var i = 0; i < length; i++) {
            int complement = target - nums[i];
            if (mapper.containsKey(complement)) {
                return new int[]{i, mapper.get(complement)};
            }
            mapper.put(nums[i], i);
        }
        return new int[]{};
    }

    /**
     * Intuition
     *
     * The Two Sum problem asks us to find two numbers in an array that sum up to a given target value. We need to return the indices of these two numbers.
     * Approach
     *
     *     One brute force approach is to consider every pair of elements and check if their sum equals the target. This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, and the inner loop iterates from the next element to the last element. However, this approach has a time complexity of O(n^2).
     *     A more efficient approach is to use a hash table (unordered_map in C++). We can iterate through the array once, and for each element, check if the target minus the current element exists in the hash table. If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.
     *
     * Approach using a hash table:
     *
     *     Create an empty hash table to store elements and their indices.
     *     Iterate through the array from left to right.
     *     For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
     *     Check if the complement exists in the hash table. If it does, we have found a solution.
     *     If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.
     *     Repeat steps 3-5 until we find a solution or reach the end of the array.
     *     If no solution is found, return an empty array or an appropriate indicator.
     *
     * This approach has a time complexity of O(n) since hash table lookups take constant time on average. It allows us to solve the Two Sum problem efficiently by making just one pass through the array.
     */
}
