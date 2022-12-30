class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0, i=0, size = operations.length;
        
        while(size-->0){
            if("X++".equals(operations[i]) || "++X".equals(operations[i])){
                x++;
            }else{
                x--;
            }
            i++;
        }
        return x;
    }
}