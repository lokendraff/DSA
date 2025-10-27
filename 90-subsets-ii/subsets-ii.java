class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        sol(nums, 0, list, new ArrayList<>());
        return list;
    }

    public static void sol(int arr[], int i, List<List<Integer>> list, List<Integer> slist){

        if(i>=arr.length){
            list.add(new ArrayList(slist));
            return;
        }


        slist.add(arr[i]);
        sol(arr, i+1, list, slist);
        slist.remove(slist.size()-1);

        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }

        sol(arr, i+1, list, slist);
    }
}