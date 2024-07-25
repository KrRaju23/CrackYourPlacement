class Solution {
    public String addBinary(String a, String b) {
       int i = a.length() - 1, j = b.length() - 1, carry = 0, sum = 0;
        StringBuilder ans = new StringBuilder();
        
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) {
                sum += (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (b.charAt(j) - '0');
                j--;
            }
            if (sum > 1) {
                ans.append(sum % 2);
                carry = 1;
            } else {
                carry = 0;
                ans.append(sum);
            }
        }
        
        if (carry == 1) {
            ans.append("1");
        }
        
        return ans.reverse().toString(); 
    }
}