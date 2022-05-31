import java.util.ArrayList;
public class Peixe
{
    private double peso;
    private String especie;
    
    public Peixe(){   }
    public Peixe(int peso, String marca){this.especie=especie;this.peso=peso;}
    
    public double calculaExcesso(double peso)
    {
        if (peso>50)
            return (peso-50)*4;
        else 
            return 0;
    }
    //public double quantoDeu(){
    //    double multa=0;
    //    for(double m: multas)
    //        multa += m;
    //    return multa;
    //}
}
