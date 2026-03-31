/*
Examen Final JAVA
Autor: Alexis Liquinchana
Fecha: 2026/03/30
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionMascotas gestion = new GestionMascotas();
        int opcion = 0;

        do {
            try {
                System.out.println("\n/*/*/*/= MENU MASCOTAS =/*/*/*/");
                System.out.println("1. Registrar mascota");
                System.out.println("2. Mostrar mascotas");
                System.out.println("3. Ejecutar sonido de una mascota");
                System.out.println("4. Buscar mascota por nombre");
                System.out.println("5. Salir");
                System.out.print("Seleccione: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Tipo: 1.Perro | 2.Gato");
                        int tipo = sc.nextInt();
                        System.out.print("ID: "); int id = sc.nextInt();
                        System.out.print("Nombre: "); String nombre = sc.next();
                        System.out.print("Edad: "); int edad = sc.nextInt();

                        if (id <= 0 || nombre.trim().isEmpty() || edad <= 0) {
                            System.out.println("Error: Datos invalidos (ID > 0, Nombre no vacio, Edad > 0).");
                        } else {
                        if (tipo == 1) { gestion.registrarMascota(new Perro(id, nombre, edad));
                        } else if (tipo == 2) { gestion.registrarMascota(new Gato(id, nombre, edad));
                        } else { System.out.println("Tipo no valido.");

                        }
                        break;
                    }
                    case 2:
                        gestion.mostrarTodas();
                        break;
                    case 3:
                        System.out.print("ID a buscar: ");
                        gestion.sonarPorId(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Nombre a buscar: ");
                        gestion.buscarPorNombre(sc.next());
                        break;
                    case 5:
                        System.out.println("Hasta pronto...");
                        break;
                    // Opciones fuera de rango
                    default:
                        System.out.println("Opcion no valida. Por favor, elija un numero del 1 al 5 e intente nuevamente.");
                
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine(); 
            }
        } while (opcion != 5);
        sc.close();
    }
}