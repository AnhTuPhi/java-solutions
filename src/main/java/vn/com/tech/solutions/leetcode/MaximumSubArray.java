/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/03/2024
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{-1};
        System.out.println(maxSubArrayBruteForce(array));
    }

    /**
     * Brute Force -> Not the right choice. Some use-case is false
     * Time complexity: O(N^2)
     * Space complexity: O(1)
     * Result = 6
     * Fail at use case nums array = [-1] -> result should be -1
     */
    public static int maxSubArrayBruteForce(int[] nums) {
        var size = nums.length;
        int max = 0;

        for (var i = 0; i < size; i++) {
            int curSum = 0;
            for(var j = i; j < size; j++) {
                curSum+=nums[j];
                max = Integer.max(max, curSum);
            }
        }
        return max;
    }

    /**
     * Dynamic Programming - Quy hoạch động - Memoization
     *
     * https://en.wikipedia.org/wiki/Memoization
     * https://en.wikipedia.org/wiki/Dynamic_programming
     * https://stackoverflow.com/questions/12042356/memoization-or-tabulation-approach-for-dynamic-programming
     * https://www.geeksforgeeks.org/dynamic-programming/
     * https://sites.radford.edu/~nokie/classes/360/dp-memoized.html#:~:text=Memoization%20is%20a%20technique%20for,than%20having%20to%20recalculate%20them
     * https://www.geeksforgeeks.org/tabulation-vs-memoization/
     * https://stackoverflow.com/questions/6184869/what-is-the-difference-between-memoization-and-dynamic-programming
     */
    public static int maxSubArrayAsMemorization(int[] nums) {

    }

    public static int maxSubArrayAsTabulation(int[] nums) {

    }
}
