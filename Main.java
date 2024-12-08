import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sistema de Gestión de Proyectos ---");
            System.out.println("1. Crear usuario");
            System.out.println("2. Crear proyecto");
            System.out.println("3. Agregar tarea a proyecto");
            System.out.println("4. Listar proyectos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Email del usuario: ");
                    String email = scanner.nextLine();
                    sistema.agregarUsuario(new Usuario(nombreUsuario, email));
                }
                case 2 -> {
                    System.out.print("Nombre del proyecto: ");
                    String nombreProyecto = scanner.nextLine();
                    System.out.print("Descripción del proyecto: ");
                    String descripcion = scanner.nextLine();
                    sistema.agregarProyecto(new Proyecto(nombreProyecto, descripcion));
                }
                case 3 -> {
                    System.out.print("Nombre del proyecto: ");
                    String proyectoTarea = scanner.nextLine();
                    Proyecto proyecto = sistema.buscarProyectoPorNombre(proyectoTarea);
                    if (proyecto != null) {
                        System.out.print("Nombre de la tarea: ");
                        String nombreTarea = scanner.nextLine();
                        Tarea tarea = new Tarea(nombreTarea);
                        proyecto.agregarTarea(tarea);
                        System.out.println("Tarea agregada.");
                    } else {
                        System.out.println("Proyecto no encontrado.");
                    }
                }
                case 4 -> {
                    for (Proyecto p : sistema.getProyectos()) {
                        System.out.println(p);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
