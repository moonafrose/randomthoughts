/*
The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

*/
public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = generateNextTerm(result);
        }
        return result;
    }

    // This method will generate the next (n+1)th term given nth term
    private String generateNextTerm(String s) {
        // basically we are grouping by frequency where they are continuous. Need to see
        // how many terms are continuously same.
        char[] ch = s.toCharArray();
        int j = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (j < s.length()) {
            while (j < s.length() - 1 && ch[j] == ch[j + 1]) {
                count++;
                j++;
            }
            sb.append(Integer.toString(count)).append(ch[j]);
            j = j + 1;
            count = 1;
        }
        return sb.toString();
    }
}