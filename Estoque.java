import java.io.*;
import java.util.*;

// Classe Estoque que gerencia os produtos
public class Estoque 
{
    private List<Produto> produtos;

    public Estoque()
    {
        this.produtos = new ArrayList<>();
    }

    public void preencheEstoque(String nomeArquivo) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        br.readLine(); // Pula a linha de cabeçalho
        String linha;
        while ((linha = br.readLine()) != null)
        {
            String[] dados = linha.split("\\s*\\*\\s*"); 
    
            if (dados.length != 5)
            {
                System.out.println("Erro ao processar linha: " + linha);
                continue;  // Pula para a próxima linha se houver erro
            }
            String nome = dados[0];
            String descricao = dados[1];
            double preco = Double.parseDouble(dados[2]);
            String tipo = dados[3];
            String infoExtra = dados[4];

            switch (tipo)
            {
                case "Alimento":
                    produtos.add(new Alimento(nome, descricao, preco, infoExtra));
                    break;
                case "Vestuario":
                    produtos.add(new Vestuario(nome, descricao, preco, Integer.parseInt(infoExtra)));
                    break;
                case "Eletrodomestico":
                    produtos.add(new Eletrodomestico(nome, descricao, preco, Double.parseDouble(infoExtra)));
                    break;
            }
        }
        br.close();
    }

    public void gerarRelatorio(String nomeArquivoSaida) throws IOException
    {
        Alimento alimentoMaisCaro = null;
        Eletrodomestico eletroMaisBarato = null;
        List<Vestuario> vestuarios = new ArrayList<>();

        for (Produto p : produtos)
        {
            if (p instanceof  Alimento)
            {
                if (alimentoMaisCaro == null || p.getPreco() > alimentoMaisCaro.getPreco())
                {
                    alimentoMaisCaro = (Alimento) p;
                }
            }
            else if (p instanceof Eletrodomestico)
            {
                if (eletroMaisBarato == null || p.getPreco() < eletroMaisBarato.getPreco())
                {
                    eletroMaisBarato = (Eletrodomestico) p;
                }
            }
            else if (p instanceof Vestuario)
            {
                vestuarios.add((Vestuario) p);
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivoSaida));

        if (alimentoMaisCaro != null)
        {
            bw.write("Alimento mais caro: " + alimentoMaisCaro.getNome() + " - Preço: R$" + alimentoMaisCaro.getPreco());
            bw.newLine();
        }
        if (eletroMaisBarato != null)
        {
            bw.write("Eletrodoméstico mais barato: " + eletroMaisBarato.getNome() + " - Preço: R$" + eletroMaisBarato.getPreco());
            bw.newLine();
        }

        bw.write("Vestuários em estoque:");
        bw.newLine();
        for (Vestuario v : vestuarios)
        {
            bw.write(v.getNome() + " - Quantidade em estoque: " + v.getQtdEstoque());
            bw.newLine();
        }
        bw.close();
    }
}
