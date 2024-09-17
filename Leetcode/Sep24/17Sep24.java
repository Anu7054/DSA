/*
   Ques Link: https://leetcode.com/problems/uncommon-words-from-two-sentences/description/?envType=daily-question&envId=2024-09-17
*/

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String, Integer> mp = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for(String s: arr1){
           mp.merge(s,1,Integer::sum);
        }

        for(String s: arr2){
           mp.merge(s,1000,Integer::sum);
        }

        mp.forEach((key,value) ->{
            int c1 = value%1000;
            int c2 = value/1000;
            if(c1 + c2 == 1){
               ans.add(key);
            }
        });
        return ans.toArray(new String[0]);
    }
}