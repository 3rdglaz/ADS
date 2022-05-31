public class Quadrado
{
    private Linha lado1,lado2,lado3,lado4;


    public Quadrado()
    {
        
    }
    //validação pra lados iguais
    public boolean ehQuadrado(){
        if(ladosIguais() && doisLadosVerticais() && doisLadosHorizontais())
            return true;
        else
            return false;
    }
    public boolean ladosIguais(){
        if((lado1.tamanho()==lado2.tamanho()) == (lado3.tamanho() == lado4.tamanho()))
            return true;
        else
            return false;
    }
    public boolean doisLadosVerticais(){
        return true;
    }
    public boolean doisLadosHorizontais(){
        return true;
    }
    // validação pra horizontais e verticais iguais
    public double perimetro()
    {
        return lado1.tamanho() + lado2.tamanho() + lado3.tamanho() + lado4.tamanho();
    }
}
