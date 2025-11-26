class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int m = Math.abs(n);
        return (m&(m-1))==0;
    }
}