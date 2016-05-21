using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static Dictionary<string, int> _wordCount = new Dictionary<string, int>();
        static void Main(string[] args)
        {
            string fileName = @"C:\randomthoughts\Word Count using Hashtable\constitution.txt";
            if (File.Exists(fileName))
            {

                using (FileStream contents = File.OpenRead(fileName))
                using (StreamReader reader = new StreamReader(contents))
                {
                    _wordCount.Clear();

                    while (!reader.EndOfStream)
                    {
                        AddtoHashTable(reader.ReadLine());
                    }
                }


            }

        }
        public static void AddtoHashTable(string line)
        {
            string[] words = line.Split(" \t,.;()\"\'".ToCharArray(), StringSplitOptions.RemoveEmptyEntries);
            foreach (string individual in words)
            {
                string tocheck = individual.ToLower();
                int count = 0;
                if (_wordCount.TryGetValue(tocheck, out count))  //if present
                {
                    _wordCount[tocheck] = count + 1;

                }
                else
                {

                    _wordCount.Add(tocheck, 1);
                }
            }
        }
    }
}
