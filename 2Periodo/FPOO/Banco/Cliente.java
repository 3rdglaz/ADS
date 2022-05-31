import java.util.ArrayList;

public class Cliente extends Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
     
     private int cpf;
     private ArrayList<Conta> contas;

    
    public Cliente(){
        contas = new ArrayList<Conta>();
    }


    public void setCpf(int cpf){this.cpf=cpf;}
    public int getCpf(){return cpf;}
    //add conta e retorna
    public ArrayList<Conta> getContas(){return contas;}
    public void addConta(Conta conta){
        // saporra nao ta adiionando contanenhuma
        // ta entenddendo como int nao como Cont
        
        contas.add(conta);
    }
    //public ArrayList<Conta> getConta(){
        //for(Conta c : contas)
            //return contas;
    //}
    
    public double saldoConta(){
        double total =0;
        for(Conta c : contas)
            total+=c.getSaldo();
        return total;
    }
}