class Solution {
    public int addDigits(int num) {
        
        int d=num;
        while(d>=10)
        {
            int sum=0;
            while(d!=0){
                int lastdigit=d%10;
                sum+=lastdigit;
                d/=10;
            }
            d=sum;
        }
        return d;
    }
}

/*
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0*/
