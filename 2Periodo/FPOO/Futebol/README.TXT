--------Goleiro----------

# ao criar um metodo de salario para o golerio
# damos @Override no metodo salario chamando do super
@Override 
public double salario(){
    return super.salario()
        + bonusJogosSemGols()//metodo que multiplica jogosemTomarGol *premioPorJogo
        - descontoGolTomado();//metod que extrai 500 por gol tomado
}

# sendo que super.var referencia ao var/metodo da classe pai
# e this.var a propria classe aplicada

----------Lateral-------
int numeroCruzamentoCerto
int numeroCruzamentoPraGol
double bonusporCruzamento

# o salario do Lateral e similar ao do goleiro
@Override
public double salario(){
    return super.salario()+
    bonusCruzamento()+
    bonusCruzamentoParaGol();
}

# metodos que definem os bonus
private double bonusCruzamento(){return numeroCruzamentosCertos*200;}
 
private double bonusCruzamentoParaGol(){retun numeroCruzamentosParaGol*premioCruzamentosParaGols;}


-----------TimeFutebol----------
public class TimeFutebol
{
    private String nome;
    
    private ArrayList<Jogador> jogadores;// tem que import java.util.ArrayList
    
    
    public void addJogador(Jogador j){
        
    }
    public TimeFutebol(String nome){
        this.nome=nome;
        jogadores = new ArrayList<>();    
    }
    
    public double totalSalarios(){
        double total = 0;
        for(Jogador j: jogadores){
            total+=j.salario();
        }
    }
    
}
