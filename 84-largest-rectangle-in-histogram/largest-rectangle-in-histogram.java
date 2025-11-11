class Solution {
    public int largestRectangleArea(int[] nums) {
        
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int lse[] = new int[n];
        int rse[] = new int[n];


        //filling left smaller element array
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            lse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        //filling right smaller element array
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }

            rse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i=0; i<n; i++){
            maxArea = Math.max(maxArea, nums[i]*(rse[i]-lse[i]-1));
        }
        return maxArea;
    }
}