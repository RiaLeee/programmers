class Solution {
    public int solution(String myString, String pat) {
        String mystr = myString.replace("A","te").replace("B","A").replace("te","B");
        
        if(mystr.contains(pat)){
            return 1;
        }
        else return 0;
    }
}