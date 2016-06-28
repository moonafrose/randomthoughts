using System;

namespace ConsoleApplication1
{
    class Class1
    {
        static void Main()
        {

            /*
             * Maximum contiguous subarray sum using brute force.
             * Calculate the sum for each contiguous segment of length N,N-1,N-2...1
             * While calculating store the maximum count found so far in a global variable
            */

            int[] arr = new int[] { 1, -2, 3, 4, -1 };
            int globalsum = 0;
            int currsum = 0;
            int length = arr.Length;
            for (int i = 0; i <= length - 1; i++)
            {
                for (int j = i; j <= length - 1; j++)
                {
                    currsum += arr[j];
                    if (currsum > globalsum)
                        globalsum = currsum;
                }
                currsum = 0;

            }
           
            Console.Write(globalsum);
            Console.ReadKey();

        }


    }
}
