
public class ContaEspecial extends Conta
{
    
    
    private double limiteCredito;
    
    public ContaEspecial(int numero, double limiteCredito){
        super(numero);
        this.limiteCredito = limiteCredito;
    }
    
    public void saque(double valor){
        if (valor >= 0 && valor <= getSaldo()+limiteCredito){
            saldo -= valor;
        }
    }
}
