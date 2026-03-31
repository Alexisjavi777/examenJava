public class Gato extends Mascota {
    public Gato(int id, String nombre, int edad) {
        super(id, nombre, edad, "Gato");
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }
}