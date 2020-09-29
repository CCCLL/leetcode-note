package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode71_简化路径_stack {
    public static void main(String[] args) {
        new LeetCode71_简化路径_stack().simplifyPath("/a//b////c/d//././/..");
        String[] split = "/a//b////c/d//././/..".split("/");
        for (String s : split) {
            System.out.println(s);
        }
    }

    public String simplifyPath(String path) {
        String[] strings = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String string : strings) {
            switch (string) {
                case "":
                    break;
                case ".":
                    break;
                case "..":
                    stack.poll();
                    break;
                default:
                    stack.push(string);
            }

        }

        if (stack.isEmpty()) return "/";

        String[] ss = new String[stack.size()];
        for (int i = ss.length - 1; i >= 0; i--) {
            ss[i] = stack.poll();
        }

        StringBuilder res = new StringBuilder();
        for (String s : ss) {
            res.append("/").append(s);
        }
        return res.toString();

    }
}
