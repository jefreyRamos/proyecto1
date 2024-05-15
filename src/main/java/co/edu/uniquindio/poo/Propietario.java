package co.edu.uniquindio.poo;

public class Propietario {
    private String nombre;
    private String id;
    
    public Propietario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        assert nombre != "";
        assert id != "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
