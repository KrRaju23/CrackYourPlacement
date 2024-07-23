class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.length() == needle.length() && haystack.equals(needle)) {
            return 0;
        }
        int x = haystack.length();
        int y = needle.length();
        for (int i = 0; i <= (x - y); i++) {
            String s = haystack.substring(i, i + y);
            if (s.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}