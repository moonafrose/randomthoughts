using System;
/// <summary>
/// Maximum Subarray Problem (O^n2)
/// </summary>
class Solution
{

    public static void Main(String[] args)
    {
        int[] arr = { 0, 1, 2, -2, 3, 2 };
        int curr_sum = 0, max_sum = 0;
        for (int i = 0; i < arr.Length; i++)
        {
            curr_sum = 0;
            for (int j = i; j < arr.Length; j++)
            {
               curr_sum += arr[j];
               if (curr_sum >= max_sum)
                   max_sum = curr_sum;
               else break;
               
            }
        }
        Console.WriteLine(max_sum);
        Console.ReadLine();

    }



}


