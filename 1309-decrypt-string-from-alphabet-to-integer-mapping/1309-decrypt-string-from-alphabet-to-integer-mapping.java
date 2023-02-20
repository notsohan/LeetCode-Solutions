class Solution {
    public String freqAlphabets(String s) {
        HashMap<String, Character> hm = new HashMap<>();
        int k=1;
        for(char c='a'; c<='z'; c++){
            if(c<'j'){
                hm.put(String.valueOf(k++), c);
            }else{
                hm.put(String.valueOf(k++)+'#', c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0;){
            if(s.charAt(i)=='#'){
                sb.append(hm.get(s.substring(i-2, i+1)));
                i-=3;
            }else{
                sb.append(hm.get(s.substring(i, i+1)));
                i--;
            }
        }
        return sb.reverse().toString();
    }
}