class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, nums, new ArrayList<>(), 0);
        return list;
    }

    public static void helper(List<List<Integer>> list, int arr[], List<Integer> slist, int i){

        if(i==arr.length){
            list.add(new ArrayList<>(slist));
            return;
        }

        helper(list, arr, slist, i+1);
        slist.add(arr[i]);
        helper(list, arr, slist, i+1);
        slist.remove(slist.size()-1);
    }
}