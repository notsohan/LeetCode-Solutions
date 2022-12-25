class Solution {
    public List<String> cellsInRange(String s) {
        List<String> lt = new ArrayList<>();

        char[] ch = s.toCharArray();
        int firstLetter, firstNumber, lastLetter, lastNumber;
        firstLetter = ch[0];
        firstNumber = Character.getNumericValue(ch[1]);
        lastLetter = ch[3];
        lastNumber = Character.getNumericValue(ch[4]);

        for(int i=firstLetter; i<=lastLetter; i++){
            String letter = String.valueOf((char) i);
            for(int j=firstNumber; j<=lastNumber; j++){
                lt.add(letter+j);
            }
        }
        return lt;
    }
}