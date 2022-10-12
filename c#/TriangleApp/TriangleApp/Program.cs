using System;

namespace TriangleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Triangle x, y;

            x = new Triangle();
            y = new Triangle();


            Console.WriteLine("Entre com as medidas do triangulo x: ");
            x.A = Double.Parse(Console.ReadLine());
            x.B = Double.Parse(Console.ReadLine());
            x.C = Double.Parse(Console.ReadLine());


            Console.WriteLine("Entre com as medidas do triangulo x: ");
            y.A = Double.Parse(Console.ReadLine());
            y.B = Double.Parse(Console.ReadLine());
            y.C = Double.Parse(Console.ReadLine());


            double areaX = x.Area();
            double areaY = y.Area();

            Console.WriteLine("Área de x:{0}", areaX.ToString("F4"));
            Console.WriteLine("Área de y: {0}", areaY.ToString("F4"));

            if (areaX > areaY)
            {
                Console.WriteLine("Maior área: X");
            } else if (areaX < areaY)
            {
                Console.WriteLine("Maior área: Y");
            } else
            {
                Console.WriteLine("As áreas são do mesmo tamanho!");
            }
        }
    }
}
