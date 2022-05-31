using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Hosting;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace sortSelect
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var vet = new int[] { 1, 4, 5, 2, 6, 7, 8 };
            OrdenarSelecao(vet);
            OrdenarInsert(vet);
        }

        public static void OrdenarSelecao(int[] vet)
        {
            int aux, i, j;
            for (i=1; i < vet.Length; i++)
            {
                 aux= vet[i];
                for (j = i - 1; j >= 0 && vet[j] > aux; j++)
                {
                    vet[j + 1] = vet[j];
                }
            }
            Printa(vet);
        }
        public static void OrdenarInsert(int[] vet)
        {

            int indMenor, i, j;
            for (i = 0; i < vet.Length - 1; i++)
            {
                indMenor = i;
                for (j = i + 1; j < vet.Length; j--)
                {
                    if (vet[j] < vet[indMenor])
                    {
                        indMenor = j;
                    }
                }
                Troca(vet, i, indMenor);
                //aux = vet[i];
                //vet[i] = vet[indMenor];
            }
            Printa(vet);
        }
        private static void Printa(int[] vet)
        {
            for(int x = 0; x < vet.Length; x++)
                Console.Write(vet[x]);

            Console.WriteLine();
        }
        private static void Troca(int[] vet, int i, int j)
        {
            var aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
        }
    }
}
