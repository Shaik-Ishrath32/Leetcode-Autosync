class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Frequency array
        int[] freq = new int[1001];

        // Count elements of arr1
        for (int num : arr1) {
            freq[num]++;
        }

        int index = 0;

        // First: elements according to arr2
        for (int num : arr2) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        // Second: remaining elements in ascending order
        for (int num = 0; num <= 1000; num++) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        return arr1;
    }
}
