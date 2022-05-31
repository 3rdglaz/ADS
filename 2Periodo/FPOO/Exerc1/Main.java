
//import math;
public class Main
{
    
    //Ponto pontoA = new Ponto(3,3);
    
    //Ponto pontoB = new Ponto(4,4);
    
    //distanciaEntrePontos(Ponto pontoA, Ponto pontoB);
    
    public static double distanciaEntrePontos(Ponto pontoA, Ponto pontoB){
        return Math.hypot(cardinalX(pontoA,pontoB), cardinalY(pontoA,pontoB));
    }
    static double cardinalX(Ponto pontoA, Ponto pontoB){
         return pontoA.getX() - pontoB.getX();
    }
    static double cardinalY(Ponto pontoA,Ponto pontoB){
        return pontoA.getY() - pontoB.getY();
    }
    //Math.sqrt(Math.pow((bx-ax),2)+Math.pow((by-ay),2));
    //pow(double x, double y)
    
    //sqrt(double x)
    
}

