import java.util.ArrayList;
public class Banco
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String gerente;
    private ArrayList<Conta> contas;
    
    public Banco()
    {
        contas = new ArrayList<Conta>();
    }
    public Banco(String nome){
        this.nome=nome;
        //this.gerente=gerente;
        contas = new ArrayList<Conta>();
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){return nome;}
    public void setGerente(String gerente){
        this.gerente=gerente;
    }
    public String getGerente(){return gerente;}   
    public void addConta(Conta conta){
        contas.add(conta);
    }
    public ArrayList<Conta> getConta(){
        return contas;
    }
    public Conta contaMaiorSaldo(){
        Conta contaMaiorSaldo=contas.get(0);
        for(Conta c: contas){
            if(c.getSaldo()>contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo=c;
            }
        }
        return contaMaiorSaldo;
    }
}
