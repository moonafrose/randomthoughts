/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
    
Note that the answer must be a substring, "pwke" is a subsequence and not a substring
*/
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty() || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        // Logic is to use two pointer approach(sliding window) that will hold only
        // unique characters. While going through each character, see if character is seen for first time, if yes then move right pointer ahead, 
		// else increment front pointer till repeated character is eliminated,resetting freq of characters 
        // calcuate max length seen so far
        int[] frequencyArr = new int[256];
        int maxLength = 0;

        for (int start = 0, end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (frequencyArr[c] == 0) {
                frequencyArr[c] = 1;
            } else {
                while (s.charAt(start) != c) {
                    frequencyArr[s.charAt(start)]=0;
                    start++;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

}