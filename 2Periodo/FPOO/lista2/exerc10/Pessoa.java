public class Pessoa
{
    
    private String nome;
    private Universidade universidade;
    
    public Pessoa()
    {

    }
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}
    public void trabalhaNa(String nome){universidade.setNome(nome);}
    public String identifica(){
        return getNome() + universidade.getNome();
    }    
}
