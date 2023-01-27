class Solution {
    public int minBitFlips(int start, int goal) {
        //return Integer.bitCount(start^goal);
        int flip = start^goal, count = 0;
        while(flip>0){
            count+=(flip&1);
            flip = flip>>1;
        }
        return count;
    }
}