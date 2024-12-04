class Solution {
    public String solution(String myString, String pat) {
        int index;
        index = myString.lastIndexOf(pat)+pat.length();
        
        return myString.substring(0,index);
    }
}