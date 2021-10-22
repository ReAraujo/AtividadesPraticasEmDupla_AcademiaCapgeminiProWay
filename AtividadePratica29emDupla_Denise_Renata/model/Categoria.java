package model;

public class Categoria extends Base {
    public String nomeCategoria;

    @Override
    public String toString() {
        String retorno ="\nInformações da Categoria: " +
                        "\n\tID categoria: " + this.id +  
                        "\n\tNome categoria: " + this.nomeCategoria + "\n";
        return retorno;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Categoria){
            Categoria outra = (Categoria)obj;
            if(this.id == outra.id){
                return true;
            }
        }
        return false;
    }


}
