package view;

public enum NarBar {
    LOGIN("=== BIENVENIDO A COMICMANIA ===\n" +
            "1. Inicio sesion\n" +
            "2. Crear cuenta\n" +
            "0. Salir"),

    HOME("=== BIENVENIDO A COMICMANIA ===\n" +
                 "1. Lista de magas \n" +
                 "2. Comprar manga\n" +
                 "0. Salir");

    private String description;

    NarBar(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
