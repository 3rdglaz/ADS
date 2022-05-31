
public class Endereco
{
    private String cidade;
    private String estado;
    private String logradouro;
    public Endereco()
    {
        
    }

    public String consultaLogradouro()
    {
        return logradouro + " " + cidade + " " + estado;
    }
}
