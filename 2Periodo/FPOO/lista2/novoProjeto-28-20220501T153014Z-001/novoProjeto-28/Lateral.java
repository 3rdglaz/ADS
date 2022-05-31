
//numero cruzamentos certos, cruzamentos para gol, bonus por cruzamento.

public class Lateral extends Jogador
{
    private int numeroCruzamentosCertos;
    private int numeroCruzamentosParaGol;
    private double premioCruzamentoParaGol;

    
    public Lateral()
    {
        super("");
    }
    public Lateral(String nome, int idade, double salarioBruto, 
    int numeroCruzamentosCertos, int numeroCruzamentosParaGol, 
    double bonusPorCruzamento)
    {
        super(nome, idade, salarioBruto);
        this.numeroCruzamentosCertos = numeroCruzamentosCertos;
        this.numeroCruzamentosParaGol = numeroCruzamentosParaGol;
        this.premioCruzamentoParaGol = premioCruzamentoParaGol;
    }
    public void setNumeroCruzamentosCertos(int numeroCruzamentosCertos)
    {
        this.numeroCruzamentosCertos = numeroCruzamentosCertos;
    }
    public int getNumeroCruzamentosCertos()
    {
        return this.numeroCruzamentosCertos;
    }
    public void setNumeroCruzamentosParaGol(int numeroCruzamentosParaGol)
    {
        this.numeroCruzamentosParaGol = numeroCruzamentosParaGol;
    }
    public int getNumeroCruzamentosParaGol()
    {
        return this.numeroCruzamentosParaGol;
    }
    public void setPremioCruzamentoParaGol(double premioCruzamentoParaGol)
    {
        this.premioCruzamentoParaGol = premioCruzamentoParaGol;
    }
    public double getPremioCruzamentoParaGol()
    {
        return this.premioCruzamentoParaGol;
    }
    
    @Override  
    public double salario()  
    {
        return super.salario() + bonusCruzamento() + bonusCruzamentoParaGol();
    }
    private double bonusCruzamento()
    {
       return numeroCruzamentosCertos * 200; 
    }
    private double bonusCruzamentoParaGol()
    {
        return numeroCruzamentosParaGol * premioCruzamentoParaGol;
    }
    
    
}
