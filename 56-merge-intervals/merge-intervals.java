import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]); 
        for (int i = 1; i < intervals.length; i++) {
            int[] last = list.get(list.size() - 1);

            if (last[1] >= intervals[i][0]) {
               
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
