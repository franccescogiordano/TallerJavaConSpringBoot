package co.com.sofka.bibliotecapublicaSprinnBootApiyMongoDB.model;

import java.util.Objects;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recursos")
public class Recurso {
    @Id
    private String id = UUID.randomUUID().toString();

    private String fechaSalida;
    private boolean estaPrestado;
    private String titulo;
    private String tipo;
    
    public Recurso(String fechaSalida, String titulo, String tipo){
        this.fechaSalida = Objects.requireNonNull(fechaSalida);
        this.titulo = Objects.requireNonNull(titulo);
        this.tipo = Objects.requireNonNull(tipo);
        this.setEstaPrestado(false);
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }


    public String getTipo() {
        return tipo;
    }

    

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
