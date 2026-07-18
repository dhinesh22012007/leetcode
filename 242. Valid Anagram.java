class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sAry=s.toCharArray();
        char[] tAry=t.toCharArray();

        Arrays.sort(sAry);
        Arrays.sort(tAry);

        if(sAry.length!=tAry.length){
            return false;
        }

        return Arrays.equals(sAry,tAry)? true:false;
    }
}

/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false*/
