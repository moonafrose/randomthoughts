using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Node<T>
    {
        public Node<T> Next { get; set; }
        public T Value { get; set; }
        public Node(T value, Node<T> next) //constructor
        {
            this.Value = value;
            this.Next = next;
        }
       
    }
    class Linked<T>
    {
        private Node<T> head;
        private int count;

        public Linked()
        {
            this.head = null;
            count = 0;
        }
        public bool IsEmpty() 
        {
            return (this.count == 0);
        }
        public void Add(T value)
        {
            Add(value, count);
        }
        public void Add(T value, int index)
        {
            if (index < 0) return;
            if (index >= count) index = count;
            Node<T> current = head;

            if (IsEmpty() || index == 0)
            {
                head = new Node<T>(value, head);
            }
            else
            {

                for (int i = 0; i < index - 1; i++)
                    current = current.Next;
                current.Next = new Node<T>(value, current.Next);
            }
            count++;
        }
        public int IndexOf(T value)
        {
            Node<T> current = head;
            for (int i = 0; i < count - 1; i++)
            {
                if (current.Value.Equals(value))
                    return i;
                current = current.Next;
            }
                return -1;
        }
        public void RemoveObject(T value)
        {
            int toremoveindex = IndexOf(value);
            if (toremoveindex != -1)
                RemoveIndex(toremoveindex);

        }
        public void RemoveIndex(int index)
        {
            if (index < 0) return;
            if (IsEmpty()) return;
            if (index >= count) index = count;
            Node<T> current = head;

            if (index == 0)
            {
                head = current.Next;
            }
            else {
                for (int i = 0; i < index - 1; i++)
                    current = current.Next;
                current.Next = current.Next.Next;
            }
            count--;
           
        }
        public void Print()
        {
            Node<T> current = head;
            while (current != null)
            {
                Console.Write(current.Value + "->");
                current = current.Next;
            }
        }
    }
    class Program{
       
        static void Main()
        {
            Linked<int> l = new Linked<int>();
            l.Add(1);            
            l.Add(3);
            l.Add(2, 1);
            l.Add(4, 1);
            l.Add(0, 0);           
            l.Print();
            l.RemoveObject(0);
            Console.WriteLine("\n");
            l.Print();
            Console.ReadKey();
        }
        
    }
}
