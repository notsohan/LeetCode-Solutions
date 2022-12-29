class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
       for(int i=0; i<candies.length; i++){
           boolean flag = true;
           int currentMax = 0;
           for(int j=0; j<candies.length; j++){
               currentMax = candies[i]+extraCandies;
               if(currentMax<candies[j]){
                   flag = false;
               }
           }
           result.add(flag);
       }
       return result;
    }
}