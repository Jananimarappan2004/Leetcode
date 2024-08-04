import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void solve(int[] candidates, int target, int i, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || i >= candidates.length) {
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) continue; // skip duplicates
            list.add(candidates[j]);
            solve(candidates, target - candidates[j], j + 1, list, result); // move to the next index
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates); // sort to handle duplicates
        solve(candidates, target, 0, list, result);
        return result;
    }
}
