/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:
    Input: 16
    Output: true

Example 2:
    Input: 5
    Output: false

*/
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        /*
         * One solution is to keep dividing the number by 4, i.e, do n = n/4
         * iteratively. In any iteration, if n%4 becomes non-zero and n is not 1 then n
         * is not a power of 4, otherwise n is a power of 4.
         */
        if (num <= 0) {
            return false;
        }
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;
        }
        return true;
    }

    public boolean isPowerOfFourI(int num) {
        /*
         * Another solution is using bitwise operator. A number is power of 4 if: 
		   * It is a power of 2 
		   * No of zero bits after the only set bit is even
         */
        PowerOfTwo p = new PowerOfTwo();
        int count = 0;
        if (p.isPowerOfTwo(num)) {
            while (num > 1) {
                count++;
                num = num >> 1;
            }
            return count % 2 == 0;
        }
        return false;
    }
}