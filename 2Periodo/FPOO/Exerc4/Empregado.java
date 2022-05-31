
/**
 - Ter no mínimo 65 anos de idade.
- Ter trabalhado no mínimo 30 anos.
- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
 */
public class Empregado
{
    // instance variables - replace the example below with your own
    private int idade, anosDeTrabalho;
    private boolean podeAposentar;
    private String nome;

    public Empregado()   {    }
    public Empregado(String nome)
    {
        this.nome = nome;
    }
    public void setIdade(int idade){this.idade = idade;}
    public void setAnosDeTrabalho(int anosDeTrabalho){this.anosDeTrabalho = anosDeTrabalho;}
    public int getIdade(){return idade;}
    public int getAnosDeTrabalho(){return anosDeTrabalho;}
    public String getNome(){return nome;}
    
    public boolean seraSeAposenta(Empregado empregado)
    {
        if(idade>64 || anosDeTrabalho>29 || anosDeTrabalho>24 && idade>59)
            return empregado.podeAposentar = true;
        else
            return empregado.podeAposentar = false;
            
    }
}
