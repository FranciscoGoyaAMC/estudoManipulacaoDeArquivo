// Classe Vestuário que herda de Produto
public class Vestuario extends Produto
{
    private int qtdEstoque;

    // Construtor classe filha que herda da classe pai
    public Vestuario(String nome, String descricao, double preco, int qtdEstoque)
    {
        super(nome, descricao, preco);
        this.qtdEstoque = qtdEstoque;
    }

    public int getQtdEstoque()
    {
        return qtdEstoque;
    }
}
