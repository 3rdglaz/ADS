import java.util.ArrayList;
public class Turma
{
    
    
    private ArrayList<Aluno> alunos;
    private Aluno representante;
    
    public Turma()
    {
        alunos = new ArrayList<Aluno>();
    }
    
    
    
    public void addAluno(Aluno aluno){alunos.add(aluno);}
    public void elegeRepresentate(){
        int maiorVoto=0;
        for(Aluno a:alunos)
            if(a.getQtdVoto()>maiorVoto)
                representante.setNome(a.getNome());
    }
    public int votos(){
        int votos = 0;
        for(Aluno a: alunos)
            if(a.getVotou())
                votos++;
        return votos;
    }
    public void porcentagemVotos(){
        int porcentagemVotos=0;
        porcentagemVotos=votos()*100/representante.getQtdVoto();        
    }
}
