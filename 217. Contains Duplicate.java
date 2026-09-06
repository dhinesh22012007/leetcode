class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> seen =new HashSet<>();

        for(int digit:nums)
        {
            if(seen.contains(digit))
            {
                return true;
            }

            seen.add(digit);
        }
        
        return false;
    }
}

/*
Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.
  */
