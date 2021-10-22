package model;

public class Produto extends Base {
    public String nomeProduto;
    public String descricao;
    public double valor;
    public Categoria categoria;

    @Override
    public String toString() {
        String retorno ="\nInformações do Produto: " + 
                        "\n\tID produto: " + this.id +
                        "\n\tNome: " + this.nomeProduto + 
                        "\n\tDescrição: " + this.descricao + 
                        "\n\tValor: " + Double.toString(this.valor) +
                        this.categoria + "\n";
        return retorno;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Produto){
            Produto outra = (Produto)obj;
            if(this.id == outra.id){
                return true;
            }
        }
        return false;
    }


}
