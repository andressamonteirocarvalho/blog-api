public class Usuarios {
    private int id;
    private String nome;
    private int quantidadeLikes;
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

    public void setQuantidadeLikes(int quantidadeLikes){
        this.quantidadeLikes = quantidadeLikes;
    }

    public int getQuantidadeLikes(){
        return this.quantidadeLikes;
    }
    public void setQuantidadePosts(int quantidadePosts){
        this.quantidadePosts = quantidadePosts;
    }

    public int getQuantidadePosts(){
        return this.quantidadePosts;
    }
    
}
