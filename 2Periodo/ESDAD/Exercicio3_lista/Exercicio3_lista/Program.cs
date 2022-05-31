
tiraAposentadoria(0,1000, 100);

static void tiraAposentadoria(int i,double reservado, double sacar)
{
        
    if (sacar < reservado)
    {
        reservado -= sacar;
        reservado *= 1.0055;
        tiraAposentadoria(i+1,reservado, sacar);
    }else
        Console.WriteLine($"{i} Saques de: \t{sacar}\nMontante final: {Math.Round(reservado, 2)}");
    
}