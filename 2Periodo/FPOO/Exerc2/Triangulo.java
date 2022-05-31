
public class Triangulo
{
    // instance variables - replace the example below with your own
    private double ladoA,ladoB,ladoC;
    
    
    public Triangulo()
    {
        
    }
    public Triangulo(double A, double B, double C)
    {
        this.ladoA = A;
        this.ladoB = B;
        this.ladoC = C;
    }
    //parametros
    // é correto usar o PRIVATE para metodos que só a classe deve usar?
    public void setT(double a, double b, double c)
    {   
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }
    private String tipoTriangulo(Triangulo x)
    {
        if(x.ladoA == x.ladoB && x.ladoB == x.ladoC)
            return "Equilatero";
        else if (ladoA == ladoB && ladoA != ladoC)
            return "Isosceles";
        else
            return "Escaleno";
    }
    private double calculaArea(Triangulo triangulo)
    {
        double per=perimetro(triangulo)/2;
        return Math.sqrt(per*(per-triangulo.ladoA)*(per-triangulo.ladoB)*(per-triangulo.ladoC));
    }
    private double perimetro(Triangulo triangulo)
    {
        return triangulo.ladoA+triangulo.ladoB+triangulo.ladoC;
    }
}
