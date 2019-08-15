package greedy;

/**
 * @program: leetcode-notes
 * @description: 134题 加油站
 * @author: chenjialin
 * @create: 2019-08-15 11:26
 **/

public class GasStation {
    /**
     * @Author chenjialin
     * @Description //自己第一遍实现
     * @Date 11:27 2019/8/15
     * @Param [gas, cost]
     * @return int
     **/
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int flag = -1;
        int yo = 0;
        for (int i = 0; i < gas.length; i++) {

            if (0 <= gas[i] - cost[i]) {
                for (int j = i; j < gas.length + i; j++) {
                    yo = yo + gas[j % gas.length] - cost[j % gas.length];
                    if (yo < 0) {
                        flag = -1;
                        break;
                    } else {
                        flag = 1;
                    }

                }
                if (flag == 1) {
                    return i;
                }
            }
            yo = 0;

        }

        return -1;
    }
    /**
     * @Author chenjialin
     * @Description //更好的解法
     * @Date 14:15 2019/8/15
     * @Param [gas, cost]
     * @return int
     **/
    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int total = 0, sum = 0, start = 0;
        for (int i = 0; i < gas.length; ++i) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }
        return (total < 0) ? -1 : start; // total 小于 0，说明总消耗大于总油量，那必定无法行驶完所有站点
    }

}
