class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int temp=x;
        int ld,reverse=0;
        while(x!=0){
            ld=x%10;
            reverse=(reverse*10)+ld;
            x/=10;
        }
        if(reverse==temp)
        return true;
        else
         return false;
       }
       else
       return false;
    }
        
}

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
