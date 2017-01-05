using System;

namespace ConsoleApplication3
{
    class Program
    {
        private static long[] fibArray = new long[10000];
        public static void Main(string[] args)
        {
            int n =7; //term -- 0 1 1 2 3 5 8
            Console.Write(Fibonacci(n-1));
            Console.ReadKey();
        }
        public static long Fibonacci(int n) 
        {
            long fibValue = 0L;
            if (n <= 1) return n;
            else if (fibArray[n] != 0)
            {
                return fibArray[n];
            }
            else 
            {
                fibValue = Fibonacci(n - 1) + Fibonacci(n - 2);
                fibArray[n] = fibValue;
                
            }
            return fibValue;
        }
    }
}
