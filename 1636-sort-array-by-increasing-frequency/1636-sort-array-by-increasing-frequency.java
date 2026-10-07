class Solution {
    public int[] frequencySort(int[] nums) {

        // Step 1: Count frequency
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        // bucket[f] contains numbers that appear f times
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : freq.keySet()) {
            int f = freq.get(num);

            if (bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }

            bucket[f].add(num);
        }

        // Step 3: Process buckets from low frequency to high frequency
        int[] result = new int[nums.length];
        int index = 0;

        for (int f = 1; f <= nums.length; f++) {

            if (bucket[f] == null) {
                continue;
            }

            // Same frequency -> larger number first
            bucket[f].sort(Collections.reverseOrder());

            // Add each number frequency times
            for (int num : bucket[f]) {
                for (int i = 0; i < f; i++) {
                    result[index++] = num;
                }
            }
        }

        return result;
    }
}
