package answer;

import java.util.LinkedList;
import java.util.List;

public class LeetCode17_回溯 {
    final String[] S = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        if (digits.length() == 0) return res;
        int[] nums = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            nums[i] = digits.charAt(i) - '0';
        }
        StringBuilder sb = new StringBuilder();
        bt(nums, 0, sb, res);
        return res;
    }

    private void bt(int[] nums, int index, StringBuilder sb, List<String> res) {
        if (index == nums.length) {
            res.add(sb.toString());
            return;
        }
        String s1 = this.S[nums[index]];
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            bt(nums, index + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
