
public class Professor extends Funcionario implements Sindicalizado
{
    // para implementar uma interface usa IMPLEMENTS
    private int numeroAulas;

    public Professor()
    {
    }
    @Override
    public double impostoSindical(){
        return salario() * 0.001;
    }
    @Override
    public double salario(){
        return numeroAulas * salarioBruto;
    }
}
