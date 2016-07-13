using System;
using System.Collections.Generic;
using System.Linq;

public class Test
{
    public static void Main()
    {
        int[] arr1 = new int[5] {0,0,1,2,1 };       
        Dictionary<int, int> dictionary = new Dictionary<int, int>();
        foreach (int x in arr1) {
            if (dictionary.ContainsKey(x))
                dictionary[x]++;
            else dictionary.Add(x, 1);
        
        }
        int myValue = dictionary.First(x => x.Value == 1).Key;
        Console.Write(myValue);

           
            Console.ReadKey();
    }
    
}




