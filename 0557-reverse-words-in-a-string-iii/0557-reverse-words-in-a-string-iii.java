class Solution {
    public String reverseWords(String s) {
        String[] sentence = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sentence.length; i++){
            if(i==sentence.length-1){
                sb.append(rev(sentence[i]));
            }else{
                sb.append(rev(sentence[i])+" ");
            }
        }
        return sb.toString();
    }
    public String rev(String sen){
        StringBuilder s = new StringBuilder();
        for(int i=sen.length()-1; i>=0; i--){
            s.append(sen.charAt(i));
        }
        return s.toString();
    }
}