/*
Given an integer, write a function to determine if it is a power of two.

Example 1:
    Input: 1
    Output: true 
    Explanation: 2⁰ = 1

Example 2:
    Input: 16
    Output: true
    Explanation: 2⁴ = 16

Example 3:
    Input: 218
    Output: false

*/
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        /*
         * If N=6 (1 1 0) ||||   If N=8 (1 0 0 0)
         then N=5 (1 0 1) |||| then N=7 (0 1 1 1)
         We observe after the rightmost setbit of N, N-1 has the bits flipped
         
         * A number which is a power of 2 has all bits set to 0 except the MSB
           eg. 8 = 1000 , 32 =100000. So to know if a no. is a power of 2, we
           reset the only set bit. Now it should be equal to 0 N & (N-1) == 0 ? true
         */
        if (n <= 0) {
            return false;
        }
        return (n & n - 1) == 0;
    }
}