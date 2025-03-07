// Classe abstrata para servir de molde para as restantes
public abstract class Produto
{
    protected String nome;
    protected String descricao;
    protected double preco;

    // Construtor
    public Produto(String nome, String descricao, double preco)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Getters
    public String getNome()
    {
        return nome;
    }

    public double getPreco()
    {
        return preco;
    }
}