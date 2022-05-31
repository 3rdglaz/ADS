public class Conta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numero;
    protected double saldo;
    private Banco banco;
    private Cliente cliente;
 
    /**
     * Construtor para objetos da classe Conta
     */
    //public Conta(){}
    public Conta(int numero){
        this.numero=numero;
        //this.saldo=saldo;
        //this.banco=banco;
        
    }
    public int getNumero(){return numero;}
    public double getSaldo(){return saldo;}
    
    public void setNumero(int numero){this.numero=numero;}
    public void setSaldo(double saldo){this.saldo=saldo;}
    
    public Banco getBanco(){return banco;}
    public Cliente getCliente(){return cliente;}
    
    
    public void setBanco(Banco banco){this.banco=banco;}
    public void setCliente(Cliente cliente){this.cliente=cliente;}
    
    public void saque(double saque)
    {
        //com ou sem retorno? visto que pode ser feito no background
        if(saque >=0 && saque<=saldo)
            saldo-=saque;
    }
    public void deposito(double deposito){
        if(deposito >=0)
            saldo+=deposito;
    }
}
