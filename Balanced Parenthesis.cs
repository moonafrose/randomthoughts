using System;
using System.Collections.Generic;

public class Stack
{
    public static void Main()
    {
        string input = "[()]{}{[()()]()}";
        Console.WriteLine(IsParanthesisBalanced(input)?"Balanced":"Unbalanced");
        Console.ReadKey();
    }

    static public bool IsParanthesisBalanced(string input)
    {
        if (input == string.Empty) return true;
        Stack<char> s = new Stack<char>();
        char[] c = input.ToCharArray();
        foreach (char x in c)
        {
            if (x == '[' || x == '(' || x == '{')
            {
                s.Push(x);
            }
            else
            {
                if (ArePairsCorrect(s.Peek(), x))
                    s.Pop();
                else return false;
            }
        }
        if (s.Count == 0) return true;
        else return false;

    }
    static bool ArePairsCorrect(char c1, char c2)
    {
        if (c1 == '[' && c2 == ']') return true;
        if (c1 == '{' && c2 == '}') return true;
        if (c1 == '(' && c2 == ')') return true;
        return false;
    }

}
