using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProductsInStock
{
    internal class Product
    {
        private string _name;
        public double Price { get; private set; }
        public int Quantity { get; private set; }

        public Product(string name, double price, int quantity)
        {
            _name = name;
            Price = price;
            Quantity = quantity;
        }

        public string Name
        {
            get { return _name; }
            set
            {
                if (value != null && value.Length >1)
                {
                    _name = value;
                }
            }
        }

        public double TotalValueInStock()
        {
            return Price * Quantity;
        }

        public int AddToStock(int quantity)
        {
            return Quantity += quantity;
        }

        public int RemoveFromStock(int quantity)
        {
            if (quantity > Quantity)
            {
                return Quantity = 0;

            }
            else
            {
                return Quantity -= quantity;
            }
        }

        public override string ToString()
        {
            return Name
                + ", U$"
                + Price.ToString("F2")
                + ", "
                + Quantity
                + " units, Total: U$"
                + TotalValueInStock().ToString("F2");
        }
    }
}
