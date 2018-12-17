import java.util.*;
/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:

All inputs will be in lowercase.
The order of your output does not matter.

*/
public class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        if(strs==null || strs.length==0){
            return answer;
        }
        //Logic is to sort each string and compare if I have seen this before,
        // only then we'll know if they are anagrams
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            if(map.containsKey(sorted)){
                List<String> values = map.get(sorted);
                values.add(str);
                map.put(sorted, values);
            }
            else{
                List<String> value = new ArrayList<>();
                value.add(str);
                map.put(sorted,value);
            }
        }
        
        answer.addAll(map.values());
        return answer;
    }
}