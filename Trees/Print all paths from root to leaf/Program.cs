using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {

        static void Main(String[] args)
        {

            BinaryTree tree = new BinaryTree();
            tree.root = new Node(10);
            tree.root.Left = new Node(8);
            tree.root.Left.Left = new Node(3);
            tree.root.Left.Right = new Node(5);
            tree.root.Right = new Node(2);
            tree.root.Right.Left = new Node(2);
            tree.printPaths(tree.root);
            
        }
    }
}
