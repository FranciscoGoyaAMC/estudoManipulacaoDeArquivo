import java.io.IOException;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo de produtos: ");
        String nomeArquivo = scanner.nextLine();

        Estoque estoque = new Estoque();
        try
        {
            estoque.preencheEstoque(nomeArquivo);
            estoque.gerarRelatorio("info.txt");
            System.out.println("Relatório gerado com sucesso em info.txt");
        } catch (IOException e)
        {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
