
public class ImovelAntigo extends Imovel
{
    
    public ImovelAntigo()
    {
        
    }

    public double correcaoPreco(int desconto)
    {
        return super.getPreco() * desconto/100;    
    }
}
