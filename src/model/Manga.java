package model;

public class Manga {

    private int id;
    private String name;
    private String author;
    private int cantidad;
    private int precio;

    public Manga(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.cantidad = 20;
        this.precio = 1200;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio ;
    }
}
