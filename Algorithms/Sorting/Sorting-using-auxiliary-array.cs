using System;

public class Sorting
{
    /// <summary>
    /// Sorting using Auxiliary array: Check where we want to insert the element.
    /// </summary>
    static int nElems = 0;
    static int[] myarray = new int[7]{24,56,1,5,53,21,1};
    static int[] copyarray = new int[7];
    public static void Main(String[] args)
    {
       
        foreach (int i in myarray)
        {
            Insert(i);
        }
        foreach (int i in copyarray)
        {
            Console.Write(i+ " ");
        }
        Console.ReadKey();
    }
    static void Insert(int x)
    {
        int i = nElems - 1;
        while (i >= 0 && copyarray[i]>x)
        {
            copyarray[i+1] = copyarray[i];
            i--;
        }
        copyarray[i + 1] = x;
        nElems++;
    }

}