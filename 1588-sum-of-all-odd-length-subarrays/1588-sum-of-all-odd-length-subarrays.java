class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            // total subarrays including arr[i]
            int totalSubarrays = (i + 1) * (n - i);

            // odd subarrays count
            int oddCount = (totalSubarrays + 1) / 2;

            // contribution of arr[i]
            totalSum += arr[i] * oddCount;
        }

        return totalSum;
    }
}