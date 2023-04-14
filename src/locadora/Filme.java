
package locadora;

import java.util.ArrayList;


public class Filme {
     ArrayList Filme = new ArrayList();

    private int codfilme;
    private String titulo;
    private String genero;

    public int getCodfilme() {
        return codfilme;
    }

    public void setCodfilme(int codfilme) {
        this.codfilme = codfilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
