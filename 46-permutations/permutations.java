class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        sol(list, nums, 0, new ArrayList<>());
        return list;
    }

    public static void sol(List<List<Integer>> list, int arr[], int idx, List<Integer> slist){
        if(idx==arr.length){
            list.add(new ArrayList<>(slist));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(slist.contains(arr[i])) continue;

            slist.add(arr[i]);

            sol(list, arr, slist.size(), slist);

            slist.remove(slist.size()-1);
        }
    }
}