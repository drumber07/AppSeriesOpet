package br.com.opet.tmm.appseriesopet.Model;

/**
 * Created by Diego on 10/05/2017.
 */

public class Serie {
    private int _ID;
    private String titulo;
    private int temporadas;
    private int episodios;
    private String imagem;
    private Categoria categoria;

    public Serie() {
        categoria = new Categoria();
    }

    public Serie(String titulo, int temporadas, int episodios) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.episodios = episodios;
        categoria = new Categoria();
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
