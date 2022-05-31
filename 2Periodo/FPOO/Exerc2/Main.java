import java.util.Scanner;
public class Main
{
    static void main(String [] args)
    {
        //Triangulo teste = new Triangulo(3,4,5);
    }
    static void imprimeArea(Triangulo t)
    {
        
    }
    static void novoTriangulo (Triangulo t)
    {
        double lado1,lado2,lado3;
        Scanner le = new Scanner(System.in);
        System.out.println("Insira o primeiro lado");
        lado1 = le.nextDouble();
        System.out.println("Insira o segundo lado");
        lado2 = le.nextDouble();
        System.out.println("Insira o terceiro lado");
        lado3 = le.nextDouble();
        Triangulo.setT(lado1, lado2, lado3);
    }
   
}
