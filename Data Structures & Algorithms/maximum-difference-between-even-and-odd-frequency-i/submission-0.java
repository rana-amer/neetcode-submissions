
class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> myMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(myMap.containsKey(s.charAt(i))){
                int x = myMap.get(s.charAt(i));
                myMap.put(s.charAt(i),x+1);
            }
            else{
                myMap.put(s.charAt(i),1);
            }
        }

        int a1 =0;
        int a2 = Integer.MAX_VALUE;
        for(int x : myMap.values()){
            if(x%2 ==0){
                a2 = Math.min(a2,x);
            }
            else{
                a1 = Math.max(a1,x);
            }
        }
        return a1-a2;
    }
}