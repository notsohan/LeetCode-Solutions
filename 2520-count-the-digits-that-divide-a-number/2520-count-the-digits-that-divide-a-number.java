class Solution {
    public int countDigits(int num) {
        int count=0, val=num;
        while(num>0){
            int t = num%10;
            if(val%t==0){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}