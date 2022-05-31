import java.util.ArrayList;

public class TimeFutebol
{
    
    private String nome;
    private ArrayList<Jogador> jogadores;
   
    public TimeFutebol(String nome)
    {
        this.nome = nome;
        jogadores = new ArrayList<>();
    }
    
    public void addJogador(Jogador jogador)
    {
        jogadores.add(jogador);
    }
    public void setNome(String nome)
    {
        this.nome =nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public double totalSalarios()
    {
        double auxiliar= 0;
        for (Jogador jogador : jogadores)
        {
            auxiliar += jogador.salario();
        }
        return auxiliar;
    }
}
