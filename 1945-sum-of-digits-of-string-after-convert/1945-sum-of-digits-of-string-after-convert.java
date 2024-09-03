import java.math.*;

class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i);
            sb.append((position - 97) + 1);
        }
        BigInteger val = new BigInteger(sb.toString());
        int sum = 0;
        while (k > 0 && val.compareTo(BigInteger.ZERO) > 0) {
            sum = 0;
            while (val.compareTo(BigInteger.ZERO) > 0) {
                sum += val.mod(BigInteger.TEN).intValue();
                val = val.divide(BigInteger.TEN);
            }
            val = BigInteger.valueOf(sum);
            k--;
        }
        return sum;
    }
}