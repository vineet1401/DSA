/**
 * You are given a string s consisting only of lowercase English letters.
 * <p>
 * You can perform the following operation any number of times (including zero):
 * <p>
 * Choose any character c in the string and replace every occurrence of c with the next lowercase letter in the English alphabet.
 * <p>
 * Return the minimum number of operations required to transform s into a string consisting of only 'a' characters.
 * <p>
 * Note: Consider the alphabet as circular, thus 'a' comes after 'z'.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "yz"
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * Change 'y' to 'z' to get "zz".
 * Change 'z' to 'a' to get "aa".
 * Thus, the answer is 2.
 * Example 2:
 * <p>
 * Input: s = "a"
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * The string "a" only consists of 'a'​​​​​​​ characters. Thus, the answer is 0.
 * <p>
 * <p>
 * Note: Please do not copy the description during the contest to maintain the integrity of your submissions.
 */

public class MinimumOperationstoTransformString {
    public int minOperations(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        int sum = 0;
        for (int i = 1; i < 26; i++) {
            if (arr[i] > 0) {
                sum += 26 - i;
                break;
            }
        }
        return sum;
    }
}
