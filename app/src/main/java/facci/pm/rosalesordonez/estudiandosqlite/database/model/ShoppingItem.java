package facci.pm.rosalesordonez.estudiandosqlite.database.model;


public class ShoppingItem {

    private long id;
    private String name;
    private String direccion;


    public ShoppingItem(long id, String name, String direccion) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
