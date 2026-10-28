class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        
        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            countS.put(s.charAt(i),1+countS.getOrDefault(s.charAt(i),0));
            countT.put(t.charAt(i),1+countT.getOrDefault(t.charAt(i),0));
        }

        for(char x : countS.keySet()){
            if(!(countS.get(x)).equals(countT.getOrDefault(x,0)))
                return false;
        } 
        return true;  
    }
}
