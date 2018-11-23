import java.util.*;
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
*/
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return s;
        }
        //We'll create an array of strings, each one will represent the characters that would appear at each row. 
        //Finally we concatenate all characters at each row.

        Direction direction = Direction.DOWN; //We need to either go down or bounce up at top and bottom level. Initially we need to go down.
        int length = s.length();
        if (numRows == 1 || numRows >= length) {
            return s;
        }
        int l = 0;
        int i = 0; 
        StringBuilder[] tempResults =new StringBuilder[numRows];
        
        for(int x=0; x<tempResults.length; x++) {
            tempResults[x]=new StringBuilder(); //Initialize stringbuilder since it throws null if we attempt to add
        }

        while (l < length) {
            tempResults[i].append(s.charAt(l));
            if (i == numRows - 1) {  // We have reached the bottom. So we need to go bounce up.
                direction = Direction.UP;
            }
            if (i == 0) {
                direction = Direction.DOWN;
            }
            if (direction == Direction.DOWN) {
                i++;
            } else {
                i--;
            }
            l++;
        }
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < tempResults.length; x++) {
            int tempLength = tempResults[x].length();
            int t=0;
            while (t < tempLength) {
                sb.append(tempResults[x].charAt(t));
                t++;
            }
        }
        return sb.toString();
    }

    enum Direction {
        DOWN, UP;
    }
}