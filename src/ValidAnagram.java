/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 *
 * Output: false
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int arr [] = new int [26];
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i:arr){
            if(i != 0) return false;
        }
        return true;

    }
}
