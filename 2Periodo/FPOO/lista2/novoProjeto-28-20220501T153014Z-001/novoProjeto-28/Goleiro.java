
public class Goleiro extends Jogador
{
    private int numeroGolsSofridos;
    private int numeroJogosSemTomarGol;
    private double premioPorJogosSemTomarGol;

    
    public Goleiro()
    {
        super("");
    }
    public Goleiro(String nome, int idade, double salarioBruto, 
    int numeroGolsSofridos, int numeroJogosSemTomarGol, 
    double premioPorJogosSemTomarGol)
    {
        super("");
        this.numeroGolsSofridos = numeroGolsSofridos;
        this.numeroJogosSemTomarGol = numeroJogosSemTomarGol;
        this.premioPorJogosSemTomarGol = premioPorJogosSemTomarGol;
    }
    // criar o metodo que calcula o salario do jogador = salario +bonus sem tomar gol 
    //- 500 por gol tomado
    
    @Override
    public double salario()
    {
        return super.salario()+ bonusJogosSemGols() - descontoGolTomado();
    }
    private double bonusJogosSemGols()
    {
        return (numeroJogosSemTomarGol * premioPorJogosSemTomarGol);
    }
    public double descontoGolTomado()
    {
        return (numeroGolsSofridos * 500);
    }
}
