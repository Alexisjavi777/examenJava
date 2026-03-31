import java.util.ArrayList;

public class GestionMascotas {
    private ArrayList<Mascota> listaMascotas;

    public GestionMascotas() {
        listaMascotas = new ArrayList<>();
    }

    // Opcion 1: Registrar con validaciones 
    public boolean registrarMascota(Mascota mascota) {
        if (mascota.getId() <= 0 || mascota.getNombre().isEmpty() || mascota.getEdad() <= 0) {
            System.out.println("Error: Datos invalidos. No se puede registrar.");
            return false;
        }
        listaMascotas.add(mascota);
        System.out.println("Mascota registrada con exito.");
        return true;
    }

    // Opcion 2: Mostrar todas con polimorfismo 
    public void mostrarTodas() {
        if (listaMascotas.isEmpty()) {
            System.out.println("La lista esta vacia.");
            return;
        }
        for (Mascota mascota : listaMascotas) {
            mascota.mostrarInfo();
            System.out.println("Sonido: " + mascota.hacerSonido()); // Polimorfismo 
            System.out.println("----------------------------");
        }
    }

    // Opcion 3: Ejecutar sonido por ID 
    public void sonarPorId(int id) {
        for (Mascota mascota : listaMascotas) {
            if (mascota.getId() == id) {
                System.out.println("El animal dice: " + mascota.hacerSonido());
                return;
            }
        }
        System.out.println("Mascota no encontrada");
    }

    // Opcion 4: Buscar por nombre 
    public void buscarPorNombre(String nombre) {
        for (Mascota mascota : listaMascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascota.mostrarInfo();
                return;
            }
        }
        System.out.println("Mascota no encontrada");
    }
}