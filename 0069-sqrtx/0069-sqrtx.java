class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  
        int low = 0, high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;  
            long sq = (long) mid * mid;        // use long to prevent overflow

            if (sq == x) {
                return mid;  // perfect square
            } else if (sq < x) {
                ans = mid;   // mid is a candidate
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
    
