class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        //case 1
        int maxSum = kadanseMaxSum(nums);


        //case2
        //task1
        int totalSum=0;
        for(int i : nums){
            totalSum += i;
        }

        //task2
        int minSum = kadanseMinSum(nums);
        
        
        //task3
        int circularSum = totalSum-minSum;

        if(maxSum<0) return maxSum;

        return Math.max(maxSum, circularSum);
        
    }

    public int kadanseMaxSum(int arr[]){
        int currSum = 0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum = Math.max(currSum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }


    public int kadanseMinSum(int arr[]){
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum = Math.min(currSum+arr[i], arr[i]);
            minSum = Math.min(minSum, currSum);
        }

        return minSum;
    }
}