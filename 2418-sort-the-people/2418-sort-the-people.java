class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Integer[] indices = new Integer[names.length];

        // Store indices
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on heights
        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);

        // Build answer
        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[indices[i]];
        }

        return result;
    }
}
