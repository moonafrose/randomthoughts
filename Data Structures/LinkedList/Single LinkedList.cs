using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    public class Program
    {
        public static void Main(String[] args)
        {
            LinkedList l = new LinkedList();
            l.Add(2);
            l.Add(1, 0);
            l.Add(3);
            l.Add(4);
            l.Print();
            //l.RemoveIndex(1);
           // Console.WriteLine("\n");
           // l.Print();
           // l.RemoveObject(5);
            Console.WriteLine("\n");
            l.Reverse();
            l.Print();
            Console.ReadKey();
        }
    }
    public class Node
    {
        private object data;
        private Node next;

        public object Data
        {
            get { return data; }
            set { data = value; }
        }
        public Node Next
        {
            get { return next; }
            set { next = value; }
        }
        public Node(object data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    public class LinkedList
    {
        private Node head;
        private int count;

        public LinkedList()
        {
            this.head = null;
            this.count = 0;
        }
        public bool IsEmpty()
        {
            return this.count == 0;
        }
        public void Add(object o, int index)
        {
            if (index < 0) throw new IndexOutOfRangeException();
            if (index >= count) index = count;

            Node current = head;

            if (index == 0 || IsEmpty())
            {
                head = new Node(o, head);

            }
            else
            {
                for (int i = 0; i < index - 1; i++)
                    current = current.Next;
                current.Next = new Node(o, current.Next);

            }
            count++;
        }
        public void RemoveObject(object o)
        {
            int index = IndexOf(o);
            if (index > -1)
                RemoveIndex(index);

        }
        public void RemoveIndex(int index)
        {
            if (index < 0) throw new Exception("Index should be greater than 0");
            if (IsEmpty()) throw new Exception("Linked list is empty");
            if (index >= count) index = count - 1;
            Node current = head;
            if (index == 0)
            {
                head = current.Next;
            }
            else
            {
                for (int i = 0; i < index - 1; i++)
                    current = current.Next;

                current.Next = current.Next.Next;
            }
            count--;
        }
        public void Add(object o)
        {
            Add(o, count);
        }
        public int IndexOf(object o)
        {
            Node current = head;
            for (int i = 0; i < count - 1; i++)
            {
                if (current.Data.Equals(o))
                    return i;
            }
            return -1;
        }
        public void Print()
        {
            Node current = head;
            while (current != null)
            {
                Console.Write(current.Data + "->");
                current = current.Next;
            }
        }
        public void Reverse()
        {
            Node current = head;

            if (IsEmpty() || count==0) { }
            if (count == 1) throw new Exception("Nothing to reverse, only single element");
            else
            {
                Node prev = null;
                Node next = null;
                while (current != null)
                {
                    next = current.Next;
                    if (next == null) head = current;
                    current.Next = prev;
                    prev = current;
                    current = next;
                }
            }

        }



    }
}
