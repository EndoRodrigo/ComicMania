package model;

public class ShoppingCar {
    private int idCliente;
    private String usermane;
    private int id;
    private String name;
    private String author;
    private int cantidad;
    private int precio;

    private int subtotal;
    private int iva;

    public ShoppingCar(int idCliente, String usermane, int id, String name, String author, int cantidad, int precio) {
        this.idCliente = idCliente;
        this.usermane = usermane;
        this.id = id;
        this.name = name;
        this.author = author;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getUsermane() {
        return usermane;
    }

    public void setUsermane(String usermane) {
        this.usermane = usermane;
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

    public int getSubtotal() {
        subtotal = this.cantidad * this.precio;
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getIva() {
        this.iva = (int) (this.subtotal * 0.19);
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Felicidades por su compra \n" +
                "Señor: " + usermane + "\n" +
                "Manga: " + name + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Valor.U: " + precio + "\n" +
                "Subtotal: " + getSubtotal() +"\n" +
                "Iva 19%: " + getIva();
    }
}
