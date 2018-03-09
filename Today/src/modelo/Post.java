
package modelo;

import java.sql.Date;


public class Post {
    private int id;
    private String titulo;
    private String contenido;
    private Date fecha_public;
    private Date ultima_mod;

    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha_public() {
        return fecha_public;
    }

    public void setFecha_public(Date fecha_public) {
        this.fecha_public = fecha_public;
    }

    public Date getUltima_mod() {
        return ultima_mod;
    }

    public void setUltima_mod(Date ultima_mod) {
        this.ultima_mod = ultima_mod;
    }

}
