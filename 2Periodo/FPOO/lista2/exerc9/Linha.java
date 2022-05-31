public class Linha
{
    private Ponto ponto1;
    private Ponto ponto2;
    
    public Linha(Ponto ponto1, Ponto ponto2)
    {
        if(ponto1 != ponto2){
            this.ponto1=ponto1;
            this.ponto2=ponto2;
        }
    }
    
    public Boolean ehVertical(){
        if(ponto1.getX()==ponto2.getX())
            return true;
        else
            return false;
    }
    public Boolean ehHorizontal(){
        if(ponto1.getY()==ponto2.getY())
            return true;
        else
            return false;
    }
    public double tamanho(){
        
        return Math.hypot((ponto1.getX()-ponto2.getX()), (ponto1.getY()-ponto2.getY()));
    }
    
}
