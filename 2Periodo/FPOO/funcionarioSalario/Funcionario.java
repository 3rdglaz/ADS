
public class Funcionario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double salarioBruto,totalLucroVendas;
    private int filhos;
    private boolean noturno,vendedor,valeTransporte;
    private String nome;
    //double Salario(salarioBruto);
    /**
     * Construtor para objetos da classe Funcionario
     */
    public Funcionario()
    {
        noturno=vendedor=valeTransporte =false;
        filhos=0;
        nome="";
        salarioBruto=totalLucroVendas=0;
    }
    
    public Funcionario(String nome, double salario, int filhos, boolean noturno, boolean valeTransporte, boolean vendedor, double totalLucroVendas)
    {
        this.nome=nome;
        salarioBruto=salario;
        this.filhos=filhos;
        this.noturno=noturno;
        this.valeTransporte =valeTransporte;
        this.vendedor=vendedor;
        this.totalLucroVendas=totalLucroVendas;
    }
    //private double salarioBruto,totalLucroVendas;
    //private int filhos;
    //private boolean noturno,vendedor,valeTransporte;
    public void setNome(String nome){this.nome=nome;}
    public void setSalarioBruto(double salarioBruto){this.salarioBruto=salarioBruto;}
    public void settotalLucroVendas(double totalLucroVendas){this.totalLucroVendas=totalLucroVendas;}
    public void setFilhos(int filhos){this.filhos=filhos;}
    public void setNoturno(boolean noturno){this.noturno=noturno;}
    public void setVendedor(boolean vendedor){this.vendedor=vendedor;}
    public void setValeTransporte(boolean valeTransporte){this.valeTransporte=valeTransporte;}
    
    //public void getNome(){return nome;}
    public double Salario(double bruto,boolean valeTransporte, boolean noturno, int filhos)
    {
        // escreva seu código aqui
        double salario = bruto *0.87;
        if(valeTransporte)
            salario -= bruto - bruto*0.03;
        
        if(noturno)
            salario += bruto + bruto*0.08;
            
        if(filhos <4){
            salario+=filhos*50;
        }else{
            salario+=150;
        }    
            
        return salario;
        
        
    }
    public boolean getVendedor(){
        return vendedor;
    }
    public double getSalario()
    {
        return salarioBruto;
    }
    public String getNome(){
        return nome;
    }
    public double SalarioDois(){
        return (salarioBruto*0.87)
                -(valeTransporte?salarioBruto*0.03:0)
                +(noturno?salarioBruto*0.08:0);
                //+( filhos>2
    }
    }

