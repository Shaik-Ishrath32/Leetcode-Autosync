class Solution {
    public List<List<Integer>> mergeSimilarItems(
            int[][] items1, int[][] items2) {

        int[] weight = new int[1001];

        // Add items from items1
        for (int[] item : items1) {
            weight[item[0]] += item[1];
        }

        // Add items from items2
        for (int[] item : items2) {
            weight[item[0]] += item[1];
        }

        List<List<Integer>> result = new ArrayList<>();

        // Values are traversed in increasing order
        for (int value = 1; value <= 1000; value++) {
            if (weight[value] > 0) {
                result.add(Arrays.asList(value, weight[value]));
            }
        }

        return result;
    }
}
