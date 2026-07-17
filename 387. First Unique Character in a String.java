class Solution {
    public int firstUniqChar(String s) {
        
        for( int i=0;i<s.length();i++){

            int count=0;

            for (int j=0;j<s.length();j++){

                if( i!=j && s.charAt(i)==s.charAt(j)){
                   count++;
                    break;
                }
            }
            if(count==0){
                    return i;
                }
        }
        return -1;
    }
}

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1*/
