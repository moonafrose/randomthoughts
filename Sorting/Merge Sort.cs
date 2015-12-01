using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterviewExamples
{
    class Program
    {

        static void Main(string[] args)
        {
            int[] numbers = new int[6] { 10, 3, 2, 7, 5,32 };
            Console.WriteLine("Before sorting:");
            foreach (int x in numbers) { Console.Write(x + " "); }
            MergeSort(numbers);
            Console.WriteLine("\nAfter sorting:");
            foreach (int x in numbers) { Console.Write(x + " "); }
            Console.ReadKey();



        }
        static void MergeSort(int[] receive)
        {
            int n = receive.Length;
            if (n == 1) return; //base condition
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            for (int i = 0; i <= mid - 1;i++ ) 
            {
                left[i] = receive[i];
            }
            for (int i = mid; i <= n - 1; i++)
            {
                right[i-mid] = receive[i];
            }
            MergeSort(left);
            MergeSort(right);
            Merge(left, right,receive);


        }
        static void Merge(int[] left, int[] right, int[] A)
        {
            int length_left = left.Length;
            int length_right = right.Length;
            int i=0,j=0,k = 0;
            while (i < length_left && j < length_right) 
            {
                if (left[i] <= right[j])
                {
                    A[k] = left[i];
                    i++;
                }
                else
                {
                    A[k] = right[j];
                    j++;
                }
                k++;


            }
            while (i < length_left) {  //blindly copy items if any one of left or right is exhaused
                A[k] = left[i];
                i++;
                k++;
            }
            while (j < length_right)
            {                         //blindly copy items if any one of left or right is exhaused
                A[k] = right[j];
                j++;
                k++;
            }
        }
    }
}
