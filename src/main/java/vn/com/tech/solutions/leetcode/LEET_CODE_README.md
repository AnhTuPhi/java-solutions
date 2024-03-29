<details>
  <summary>#1: Two Sum</summary>
  
      Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
      You may assume that each input would have exactly one solution, and you may not use the same element twice.
      You can return the answer in any order.
      Example 1:
      Input: nums = [2,7,11,15], target = 9
      Output: [0,1]
      Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

      Example 2:
      Input: nums = [3,2,4], target = 6
      Output: [1,2]

      Example 3:
      Input: nums = [3,3], target = 6
      Output: [0,1]

      Constraints:
      2 <= nums.length <= 104
      -109 <= nums[i] <= 109
      -109 <= target <= 109
      Only one valid answer exists.
      Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
    
</details>
<details>
  <summary>#2: Add Two Number</summary>
      
      You are given two non-empty linked lists representing two non-negative integers.
      The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

      You may assume the two numbers do not contain any leading zero, except the number 0 itself.

      Example 1:
      Input: l1 = [2,4,3], l2 = [5,6,4]
      Output: [7,0,8]
      Explanation: 342 + 465 = 807.

      Example 2:
      Input: l1 = [0], l2 = [0]
      Output: [0]

      Example 3:
      Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
      Output: [8,9,9,9,0,0,0,1]

      Constraints:
      The number of nodes in each linked list is in the range [1, 100].
      0 <= Node.val <= 9
      It is guaranteed that the list represents a number that does not have leading zeros.
     
</details>
<details>
  <summary>#9: Palindrome Number</summary>
  
    Given an integer x, return true if x is a palindrome, and false otherwise.
    Example 1:
  
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
  
    Example 2:
  
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    
    Example 3:
  
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
  
    Constraints:
    -231 <= x <= 231 - 1
    Follow up: Could you solve it without converting the integer to a string?
</details>
<details>
  <summary>#13: Roman To Integer</summary>
  
      Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

      Symbol       Value
      I             1
      V             5
      X             10
      L             50
      C             100
      D             500
      M             1000
      For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

      Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

      I can be placed before V (5) and X (10) to make 4 and 9.
      X can be placed before L (50) and C (100) to make 40 and 90.
      C can be placed before D (500) and M (1000) to make 400 and 900.
      Given a roman numeral, convert it to an integer.

      Example 1:

      Input: s = "III"
      Output: 3
      Explanation: III = 3.
      Example 2:

      Input: s = "LVIII"
      Output: 58
      Explanation: L = 50, V= 5, III = 3.
      Example 3:

      Input: s = "MCMXCIV"
      Output: 1994
      Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

      Constraints:

      1 <= s.length <= 15
      s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
      It is guaranteed that s is a valid roman numeral in the range [1, 3999].

</details>

<details>
  <summary>#53: Maximum sub-array</summary>
  
    Given an integer array nums, find the subarray with the largest sum, and return its sum.
    Example 1:
  
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    Example 2:
    
    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.
    Example 3:
    
    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
     
    Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
  
    Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
</details>
