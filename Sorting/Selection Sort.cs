using System;

public class Sorting
{
	public static void Main()
	{
		    int[] array = new int[6] { 5, 6,4,10,20,2};
            Console.WriteLine("Before Selection Sort:");
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i]+ " ");
            }
            int tmp, min,flag=0;

            for (int outer = 0; outer < array.Length - 1; outer++)
            {
                min=outer;

                for (int inner = outer + 1; inner < array.Length; inner++)
                {
                    if (array[inner] < array[min])
                    {
                        min = inner;
                        flag = 1;
                    }
                }
                if (flag == 1)    //swap outer with minimum found
                {
                    tmp = array[outer];
                    array[outer] = array[min];
                    array[min] = tmp;
                }
            }

            Console.WriteLine("\n After Selection Sort:");
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i]+ " ");
            }
            Console.ReadLine();
	}
}