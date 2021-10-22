package view;

import controller.CategoriaController;
import controller.ProdutoController;
import model.Categoria;
import model.Produto;

public class MainTesteValidacao {
    public static void main(String[] args) {
        CategoriaController categoriaController =  new CategoriaController();
        ProdutoController produtoController = new ProdutoController();

        // Criando os objetos e adicionando os valores de atributo
        Categoria cate1 = new Categoria();
        cate1.id = 0001;
        cate1.nomeCategoria = "Eletrodomesticos";

        Produto prod1 = new Produto();
        prod1.id = 0001;
        prod1.nomeProduto = "Geladeira";
        prod1.descricao = "Frost free ";
        prod1.valor = 2000.00;
        prod1.categoria = cate1;

        Produto prod2 = new Produto();
        prod2.id = 0002;
        prod2.nomeProduto = "Fogão";
        prod2.descricao = "5 bocas";
        prod2.valor = 1000.00;
        prod2.categoria = cate1;

        // Adicionando os objetos criados no ArrayList
        categoriaController.create(cate1);
        produtoController.create(prod1);
        produtoController.create(prod2);

        // Imprimindo tamanho das listas de Categoria e Produto
        System.out.printf("\nTamanho da lista de Categoria: %s ", categoriaController.tamanhoLista());
        System.out.printf("\nTamanho da lista de Produtos: %s ", produtoController.tamanhoLista());

        // Imprimindo dados da lista 
        System.out.printf("\nImpressão da lista de Categoria: %s", categoriaController.read());
        System.out.printf("\nImpressão da lista de Produto: %s", produtoController.read());
        
        // Deletando o objeto prod2
        produtoController.delete(prod2);

        // Imprimindo novamente os dados da lista 
        System.out.printf("\nImpressão da lista de Produto: %s", produtoController.read());






        

        
        











    }
    
}
