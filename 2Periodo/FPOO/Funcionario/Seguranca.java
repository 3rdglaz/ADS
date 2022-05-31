
public class Seguranca extends Funcionario implements Insalubridade
{
    
    private int numeroPlantao;

    public Seguranca()
    {

        
    }
    @Override
    public double insalubridade(){
        return salario() * 0.05;
    }
    @Override
    public double salario(){
        return numeroPlantao * salarioBruto;
    }
}
