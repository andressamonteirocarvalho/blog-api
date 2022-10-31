public class Comentarios {
    private int id;
    private String nome;
    private String data;

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

    public void setData(String data){
        this.data = data;
    }

    public String getData() {
        return this.data;
    }
}
