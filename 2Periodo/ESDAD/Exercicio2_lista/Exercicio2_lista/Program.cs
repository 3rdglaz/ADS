/*
 Faça uma função que receba um vetor de números inteiros por
parâmetro e multiplique por -1 todos os elementos negativos desse vetor. A função
deve retornar o número de elementos negativos encontrados. Restrição: não utilize
comandos de repetição.
 */
int[] vet = new int[] {-1,2,-3,4,-5,6,-7};

MultiplicaNegativo(vet,0,0);

static int MultiplicaNegativo(int[] vet, int i, int numeroNegativos)
{
    if (i <= vet.Length - 1)
    {
        if (vet[i] < 0)
        {
            vet[i] = vet[i] * (-1);
            numeroNegativos++;
            //Console.WriteLine($"{i} leitura) numeros negativos encontrados : {numeroNegativos} ");
            return MultiplicaNegativo(vet, i + 1, numeroNegativos);
            //return numeroNegativos;
        }
        else
        {
            //Console.WriteLine($"{i} leitura) numeros negativos encontrados : {numeroNegativos} ");
            return MultiplicaNegativo(vet, i + 1, numeroNegativos);
            //return numeroNegativos;
        }
    }
    //else
    //{
        Console.WriteLine($"numeros negativos encontrados : {numeroNegativos}");
        return numeroNegativos;
        
    //}
}