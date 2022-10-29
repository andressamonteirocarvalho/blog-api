public class Categorias {
    private int id;
    private String nome;
    private String capa;
    private int quantidadePosts;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setNome( String nome){
        this.nome = nome; 
    }

    public String getNome(){
        return this.nome;
    }

    public void setCapa(String capa){
        this.capa = capa;
    }

    public String getCapa() {
        return this.capa;
    }

    public void setQuantidadePosts(int quantidadePosts){
        this.quantidadePosts = quantidadePosts;
    }

    public int getQuantidadePosts(){
        return this.quantidadePosts;
    }

}