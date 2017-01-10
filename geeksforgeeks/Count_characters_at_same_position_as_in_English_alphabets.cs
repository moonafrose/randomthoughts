using System;

namespace ConsoleApplication4
{
    class Program
    {
        static void Main(string[] args)
        {
            //Given a string of lower and uppercase characters, the task is to find that how many characters are at same position as in English alphabets.
            //http://www.geeksforgeeks.org/count-characters-position-english-alphabets/

            string input = "ABcED";
            Console.WriteLine(FindCount(input));
            Console.ReadKey();

        }
        private static int FindCount(string input)
        {
            int count = 0;
            for (int i = 0; i < input.Length; i++)
            {
                if (input[i] - 'a' == i || input[i] - 'A' == i)
                {
                    count++;
                }
            }
            return count;

        }
    }
}
