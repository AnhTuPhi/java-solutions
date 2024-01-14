package vn.com.tech.solutions.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : AnhTuPhi
 * @created : 1/14/2024 - 1:35 PM - Sunday
 * @project : java-solutions
 **/
public class RomanToInteger {

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     * Example 2:
     * <p>
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 3:
     * <p>
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 15
     * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     */
    public static void main(String[] args) {
        System.out.println(romanToInt(new String("V")));
    }

    public static final Map<String, Integer> mapper = new HashMap<>(8);

    static {
        initHashMap();
    }

    public static void initHashMap(){
        mapper.put("I", 1);
        mapper.put("V", 5);
        mapper.put("X", 10);
        mapper.put("L", 50);
        mapper.put("C", 100);
        mapper.put("D", 500);
        mapper.put("M", 1000);
    }

    public static int romanToInt(String in) {
        return mapper.get(in);
    }

}
