public class Empregado
{
    
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Empregado()
    {
    
    }

    public void setNome(String nome){this.nome=nome;}
    public void setSobrenome(String sobrenome){this.sobrenome=sobrenome;}
    public void setCPF(String cpf){this.cpf=cpf;}
    
    public String getNome(){return nome;}
    public String getSobrenome(){return sobrenome;}
    public String getCPF(){return cpf;}
    
    public double vencimento()
    {
        return 0;
    }
}
