import java.util.ArrayList;
public class Empresa
{
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    
       
    public Empresa(){
        funcionarios = new ArrayList<Funcionario>() ;    
    }
    public Empresa(String nome){
        this.nome = nome;
    }
    public void addFuncionario(Funcionario funcionario)
    {
        funcionarios.add(funcionario);
    }
    public double totalSalarios()
    {
        double salariosSoma =0;
        for (int i = 0; i< funcionarios.size(); i++)
            salariosSoma =+ funcionarios.get(i).getSalario();
        return salariosSoma;
        
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    
}
