public class Mascota {
    // Atributos privados para encapsulamiento 
    private int id;
    private String nombre;
    private int edad;
    private String tipo;

    // Constructor 
    public Mascota(int id, String nombre, int edad, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getId() { 
        return id;
    }
    public String getNombre() { 
        return nombre; 
    }
    public int getEdad() { 
        return edad; 
    }
    public String getTipo() { 
        return tipo; 
    }

    // Metodo para representar el comportamiento 
    public String hacerSonido() {
        return "La mascota hace un sonido general";
    }

    // Metodo para mostrar los datos 
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Tipo: " + tipo);
    }
}
