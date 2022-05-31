
public class Jogador
{
    private String nome;
    private int idade;
    private double salarioBruto;
    

    public Jogador(String nome)
    {
        this(nome, 0, 0);
    }
    public Jogador(String nome, int idade)
    {
        this(nome, idade, 0); 
    }
    public Jogador(String nome, int idade, double salarioBruto)
    {
        this.nome = nome;
        this.idade = idade;
        this.salarioBruto = salarioBruto;
    }

    public void setNome(String nome)
    {
        this.nome =nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setIdade(int idade)
    {
        this.idade =idade;
    }
    public int getIdade()
    {
        return this.idade;
    }
    public void setSalarioBruto(double salarioBruto)
    {
        this.salarioBruto =salarioBruto;
    }
    public double getSalarioBruto()
    {
        return this.salarioBruto;
    }
    public double salario()
    {
        return salarioBruto * 0.87;
    }

  
    
}
