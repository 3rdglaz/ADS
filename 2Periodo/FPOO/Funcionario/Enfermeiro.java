
public class Enfermeiro extends Funcionario implements Sindicalizado, Insalubridade
{
    
    private int numeroEventos;

    public Enfermeiro()
    {
           
    }
    @Override 
    public double insalubridade(){
        return salario() * 0.05;
    }
    @Override
    public double impostoSindical(){
        return salario() * 0.001;
    }
    @Override
    public double salario(){
        return numeroEventos * salarioBruto;
    }

}
