
/**
 * Write a description of class Aluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aluno
{
    // instance variables - replace the example below with your own
    private String nome;
    private int qtdVoto;
    private Boolean votou;
    private Boolean eleito;
    
    public Aluno(){}
    
    public Boolean getVotou(){return votou;}
    public void setVotou(Boolean votou){this.votou=votou;}
    
    public int getQtdVoto(){return qtdVoto;}
    public void setQtdVoto(int qtdVoto){this.qtdVoto=qtdVoto;}
    
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}
    // no main só vota se não tiver votado
    public void Votar(Aluno eleito,Aluno votante)
    {
        votante.setVotou(true);
        eleito.setQtdVoto(eleito.getQtdVoto()+1);
    }
    
}
