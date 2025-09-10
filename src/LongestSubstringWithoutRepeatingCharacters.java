/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int arr [] = new int [256];
        int l = 0;
        int r = 0;
        int max = 0;
        for(r=0; r<s.length(); r++){
            int index = s.charAt(r);
            if(arr[index] == 0){
                arr[index]++;
                max = Math.max(max, r-l+1);
            }else{
                while(s.charAt(l) != s.charAt(r)){
                    arr[s.charAt(l)]--;
                    l++;
                }
                arr[index]=1;
                l++;
                max = Math.max(max, r-l+1);
            }
        }
        return max;
    }
}
