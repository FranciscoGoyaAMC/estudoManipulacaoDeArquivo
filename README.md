# Sistema de Gerenciamento de Estoque

Este projeto é um sistema simples de gerenciamento de estoque para uma loja, que lê um arquivo contendo informações sobre produtos e gera um relatório com estatísticas sobre os itens armazenados.

## 📜 Descrição

O programa lê um arquivo de produtos no seguinte formato:

```
Produto * Descrição * Preço * Tipo * Informação extra
Café * Café descafeinado * 2.00 * Alimento * 10/12/2015
Bolacha * Integral * 5.53 * Alimento * 2/4/2010
Camiseta * Manga curta * 17.90 * Vestuário * 10
Fogão * 4 bocas * 890.00 * Eletrodoméstico * 125.00
```

Com base nesses dados, os produtos são armazenados em um array e classificados em três categorias:
- **Alimentos** (possuem data de validade)
- **Vestuário** (possuem quantidade em estoque)
- **Eletrodomésticos** (possuem um valor adicional de IPI)

Após a leitura dos produtos, o sistema gera um relatório chamado `info.txt`, contendo:
- O alimento mais caro
- O eletrodoméstico mais barato
- Nome e quantidade em estoque de todos os produtos da categoria vestuário

## 📂 Estrutura do Projeto

```
📦 Estoque
├── 📄 Produto.java (classe abstrata base)
├── 📄 Alimento.java (subclasse de Produto)
├── 📄 Vestuario.java (subclasse de Produto)
├── 📄 Eletrodomestico.java (subclasse de Produto)
├── 📄 Estoque.java (classe responsável pela leitura e armazenamento dos produtos)
├── 📄 Principal.java (classe com o método `main` para execução do programa)
└── 📄 produtos.txt (exemplo de arquivo de entrada)
```

## 🛠 Tecnologias Utilizadas
- Java
- Leitura e escrita de arquivos com `BufferedReader` e `BufferedWriter`
- Programação Orientada a Objetos (POO)

---
Desenvolvido por [Francisco Goya][https://github.com/FranciscoGoyaAMC] 🚀

