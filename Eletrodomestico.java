// Classe Eletrodomestico que herda de Produto
public class Eletrodomestico extends Produto
{
    private double ipi;

    public Eletrodomestico(String nome, String descricao, double preco, double ipi)
    {
        super(nome, descricao, preco);
        this.ipi = ipi;
    }
   
    // Getter
    public double getIpi()
    {
        return ipi;
    }
}
