using System;

class Solution
{
    static void Main(String[] args)
    {
        int[] arr = new int[6] { 8, 6, 10, 1, 14, 2 };
        QuickSort(arr, 0, arr.Length - 1);
        foreach (int x in arr)
            Console.Write(x + " ");
        Console.ReadKey();

    }
    public static int Partition(int[] a, int start, int end)
    {
        int assume_pivot = a[end]; //say last element is pivot
        int p_index = start;
        for (int i = start; i <= end-1; i++)
        {
            if (a[i] <= assume_pivot) //put smaller elements to the front 
            {
                swap(i, p_index,a);
                p_index++;
            }
        }
        swap(p_index, end,a);
        return p_index;

    }
    public static void swap(int a, int b,int[]ar)
    {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
    public static void QuickSort(int[] a, int start, int end)
    {
        if (start < end)
        {
            
            int partition = Partition(a, start, end);
            QuickSort(a, start, partition - 1);
            QuickSort(a, partition + 1, end);
        }
    }
  
}
