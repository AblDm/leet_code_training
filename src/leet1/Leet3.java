package leet1;

import java.util.Arrays;

public class Leet3 {

    //14. Longest Common Prefix
    //Easy
    //15.4K
    //4.2K
    //Companies
    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".
    //
    //
    //
    //Example 1:
    //
    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    //Example 2:
    //
    //Input: strs = ["dog","racecar","car"]
    //Output: ""
    //Explanation: There is no common prefix among the input strings.
    //
    //
    //Constraints:
    //
    //1 <= strs.length <= 200
    //0 <= strs[i].length <= 200
    //strs[i] consists of only lowercase English letters.


    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};


        Long start = System.nanoTime();
        StringBuilder r = longestCommonPrefix(strs);
        Long finish = System.nanoTime();
        StringBuilder p = new StringBuilder("результат " + r + " получен за " + (finish - start) + " наносекунд");

        System.out.println(p);



    }
        public static StringBuilder longestCommonPrefix(String[] strs) {
            StringBuilder result = new StringBuilder ();
            Arrays.sort(strs);
            char[] first=strs[0].toCharArray();
            char[] last = strs[strs.length-1].toCharArray();
            for (int i=0;i<first.length; i++){
                if(first[i]!=last[i])
                    break;
                result.append(first[i]);

            }
            return result;
        }
}
