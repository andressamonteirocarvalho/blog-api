public class Posts {
    private int id;
    private String titulo;
    private String data;
    private String conteudo;
    private int quantidadeLikes;
    private int quantidadeComentarios;
    private int quantidadeReferencias;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setTitulo( String titulo){
        this.titulo = titulo; 
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setQuantidadeLikes(int quantidadeLikes){
        this.quantidadeLikes = quantidadeLikes;
    }

    public int getQuantidadeLikes(){
        return this.quantidadeLikes;
    }
    public void setQuantidadeComentarios(int quantidadeComentarios){
        this.quantidadeComentarios = quantidadeComentarios;
    }

    public int getQuantidadeComentarios(){
        return this.quantidadeComentarios;
    }
    public void setQuantidadeReferencias(int quantidadeReferencias){
        this.quantidadeReferencias = quantidadeReferencias;
    }

    public int getQuantidadeReferencias(){
        return this.quantidadeReferencias;
    }
}
