public class Pessoa
{
    private String nome;
    private Endereco endereco;
    private String numero;
    public Pessoa()
    {
        
    }

    public String consultaEndereco()
    {
        return endereco.consultaLogradouro();
    }
    public String consultaNome(){
        return nome;
    }
}
