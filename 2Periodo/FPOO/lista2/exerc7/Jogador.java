public class Jogador extends Atleta
{
    private int numero;
    private int posicao;
    //(0 -goleiro, 1 -Zaga, 2 -Meio campo, 3- ataque
    public Jogador()
    {
        
    }

    public int sampleMethod(int y)
    {
        return 0;
    }
    public int getNumero(){return numero;}
    public void setNumer(int numero){this.numero=numero;}
    
    public int getPosicao(){return posicao;}
    public void setPosicao(int posicao){this.posicao=posicao;}
}

