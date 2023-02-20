class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int point = Integer.parseInt(String.valueOf(s.charAt(i)));
                sb.append((char)(s.codePointAt(i-1)+point));
            }else if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}