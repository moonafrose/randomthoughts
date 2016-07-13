using System;

public class BinarySearch
{
    public static void Main()
    {
        int[] arr = new int[7] { 1, 2, 3, 4, 5, 6, 7 };
        int searchkey = 7;
        int returnval = Binary_Iterative(arr, searchkey);
        if (returnval == -1) Console.WriteLine("Unable to find " + searchkey);
        else Console.WriteLine(searchkey + " found in position " + returnval + " of given array");
    }
    public static int Binary_Iterative(int[] arr, int key)
    {
        int lowerbound = 0, upperbound = arr.Length - 1, mid = 0;
        while (lowerbound <= upperbound)
        {
            mid = lowerbound + (upperbound - lowerbound) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key) //The key we are searching is greater than mid that means it lies in upper half of array, so ignore lower half
                lowerbound = mid + 1;
            else upperbound = mid - 1;
        }
        return -1;
    }
}