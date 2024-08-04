class Solution {
    public void solve(int[] nums, List<List<Integer>> result, List<Integer> list, int i) {
        result.add(new ArrayList<>(list)); // Add current subset to result
        for (int j = i; j < nums.length; j++) {
            // Skip duplicates
            if (j > i && nums[j] == nums[j - 1]) continue;
            list.add(nums[j]);
            solve(nums, result, list, j + 1);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums, result, list, 0);
        return result;
    }
}