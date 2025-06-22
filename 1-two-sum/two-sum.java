class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] brr=new int[2];
        int[] crr=new int[2];
        crr[0]=-1;
        crr[1]=-1;
        for(int i=0;i<arr.length;i++){
       
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    brr[0]=i;
                    brr[1]=j;
                    return brr;
                  
                    
                }
            }
        }
        return crr;

        
    }
}