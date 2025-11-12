class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : (i - st.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int nse = n;
            int height = heights[st.pop()];
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, height*(nse-pse-1));
        }

        return maxArea;
    }
}