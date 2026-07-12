class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] found = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            found[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!found[i]) {
                return false;
            }
        }

        return true;
    }
}

/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false*/
