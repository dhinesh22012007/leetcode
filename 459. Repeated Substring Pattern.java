class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {

            if (n % len != 0) {
                continue;
            }

            String pattern = s.substring(0, len);
            boolean match = true;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != pattern.charAt(i % len)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}
