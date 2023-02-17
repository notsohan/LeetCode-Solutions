class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        boolean upper = false, lower = false, digit = false, specialChar = false;

        for(int i=0; i<password.length(); i++){
            char c = password.charAt(i);

            if(c >= 'A' && c <= 'Z'){
                upper = true;
            }else if(c >= 'a' && c <= 'z'){
                lower = true;
            }else if(c >= '0' && c <= '9'){
                digit = true;
            }else{
                specialChar = true;
            }

            if(i>0 && password.charAt(i-1)==c) return false;
        }
        return upper && lower && digit && specialChar;
    }
}