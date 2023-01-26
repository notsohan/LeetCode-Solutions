class Solution {
    public String sortSentence(String s) {
        String[] word = s.split(" ");
        String[] sentence = new String[word.length];
        for(int i=0; i<word.length; i++){
            int num = Integer.parseInt((String.valueOf(word[i].charAt(word[i].length()-1))));
            String sen = word[i].substring(0, word[i].length()-1);
            sentence[num-1] = sen;
        }
        return String.join(" ", sentence);
    }
}