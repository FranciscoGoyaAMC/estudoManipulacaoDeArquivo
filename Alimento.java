// Classe Alimento que herda de Produto
public class Alimento extends Produto
{
    private String dataValidade;

    // Construtor da classe filha herdando da classe pai
    public Alimento(String nome, String descricao, double preco, String dataValide)
    {
        super(nome, descricao, preco);
        this.dataValidade = dataValide;
    }

    // Getter
    public String getDataValidade()
    {
        return dataValidade;
    }
}
