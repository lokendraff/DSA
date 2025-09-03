class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0, cSum=0;
        for(int i=0; i<nums.length; i++){
            cSum += nums[i];
            int t = cSum-k;
            if(map.containsKey(t)){
                ans += map.get(t);
                // map.put(t, map.getOrDefault(t,0)+1);
            }
            map.put(cSum, map.getOrDefault(cSum,0)+1);
        }
        return ans;
    }
}