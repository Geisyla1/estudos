package orientacaoObjeto.Csobrecargademetodos.dominio;

public class Anime {
    private String tipo;
    private int episodio;

    public  void init(String tipo, int episodio){
        this.tipo = tipo;
        this.episodio = episodio;
    }
    public void imprimeAnime(){
        System.out.println(this.tipo);
        System.out.println(this.episodio);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodio(int episodio){
        this.episodio = episodio;
    }
    public int getEpisodio(){
        return  this.episodio;
    }
}
