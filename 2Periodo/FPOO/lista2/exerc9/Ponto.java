public class Ponto
{

    private int x;
    private int y;
    
    public Ponto()
    {
        // initialise instance variables
        x = 0;
    }

    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    public int getX(){return x;}
    public int getY(){return y;}
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
