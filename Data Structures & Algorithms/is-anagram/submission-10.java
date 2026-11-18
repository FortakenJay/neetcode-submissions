class Solution {
    public boolean isAnagram(String s, String t) {
        int[] answer = new int[26];

        if(s.length() != t.length()){
            return false; 
        }
        for(int i =0; s.length() > i; i++){
            answer[s.charAt(i) - 'a'] = answer[s.charAt(i) - 'a'] +1 ;
            answer[t.charAt(i) - 'a'] = answer[t.charAt(i) - 'a'] -1;
        }

        for(int position: answer){

            if(position != 0){
                return false;
            }
        }
        return true;
    }
}

