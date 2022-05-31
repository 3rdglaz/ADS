
public class Salario
{
    // instance variables - replace the example below with your own
    private int horasTrabalhadas, dependentes;
    private double salarioHora;
    private String nome;
    
    public Salario(){}
    public Salario(String nome)
    {
        this.nome=nome;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){this.horasTrabalhadas=horasTrabalhadas;}
    public void setDependentes(int dependentes){this.dependentes=dependentes;}
    public void setSalarioHora(double salarioHora){this.salarioHora=salarioHora;}
    public double salarioBruto()
    {
        return horasTrabalhadas*salarioHora+(dependentes*50);
    }
    public double INSS(){
        if(salarioBruto()<=1000)
            return salarioBruto()*8.5/100;
        else
            return salarioBruto()*9/100;
    }
    public double IR(){
        double IR;
        if(salarioBruto()<=500)
            return IR=0;
        else if(salarioBruto()>500 && salarioBruto()<=1000)
            return IR=salarioBruto()*5/100;
        else
            return IR=salarioBruto()*7/100;
    }
    public double salarioLiquido(){
        return salarioBruto()-INSS()-IR();
    }
}
