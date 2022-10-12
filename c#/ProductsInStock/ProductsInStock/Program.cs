using System;

namespace ProductsInStock
{
    internal class Program
    {
        static void Main(string[] args)
        {
           

            Console.WriteLine("Enter product data: ");

            Console.Write("Product name: ");
            string name = Console.ReadLine();

            Console.Write("Price: ");
            double price = double.Parse(Console.ReadLine());

            Console.Write("Quantity in stock: ");
            int quantity = int.Parse(Console.ReadLine());

            Product p = new Product(name, price,quantity);

            Console.WriteLine("Product data: {0}", p);

            Console.WriteLine("Quantity to be added to stock: ");
            int addQuantity = int.Parse(Console.ReadLine());
            p.AddToStock(addQuantity);
            Console.WriteLine("Product data: {0}", p);

            Console.WriteLine("Quantity to be Removed from stock: ");
            int removeQuantity = int.Parse(Console.ReadLine());
            p.RemoveFromStock(removeQuantity);
            Console.WriteLine("Product data: {0}", p);
        }
    }
}
