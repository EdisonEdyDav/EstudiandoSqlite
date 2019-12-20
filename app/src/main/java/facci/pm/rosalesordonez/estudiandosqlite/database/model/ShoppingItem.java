package facci.pm.rosalesordonez.estudiandosqlite.database.model;


public class ShoppingItem {

    private long id;
    private String name;
    private String direccion;
    private String fecha;
    


    public ShoppingItem(long id, String name, String direccion, String fecha) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
        this.fecha = fecha;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
