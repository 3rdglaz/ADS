

public class Aluno
{
    private String nome;
    private int nota;
    private int matricula;
    
    public boolean Resultado(){
        // vai retornar true or false    
        return (nota >= 7);
        }
    //Construtor para objetos da classe Aluno vazio
    public Aluno (){}
    public void setNome(String vNome){
        nome = vNome;
    }
    // set Nota   
    public void setNota(int novaNota){
        if(novaNota >=0 && novaNota<=10)
            nota = novaNota;    
    }
    // set Nome
    public void alteraNome(String novoNome){
        if(!novoNome.equals("") && novoNome != null)
            nome = novoNome;        
    }
    // getNome
    public String exibeNome(){
        return nome;
    }
    // getNota
    public int exibeNota(){
        return nota;
    }
    }

