import java.util.Scanner;

public class GestorMenu {
    private Scanner scanner;

    public GestorMenu() {
        this.scanner = new Scanner(System.in);
    }

    // --- SOBRECARGA 1: Menú para MÉDICO ---
    // Recibe un objeto de tipo Medico
    public void mostrarMenu(Medico medico) {
        int opcion = 0;
        do {
            System.out.println("\n--- PANEL DE MÉDICO: Dr./Dra. " + medico.getNombre() + " ---");
            System.out.println("1. Atender Cita (Consultorio)");
            System.out.println("2. Ver Pacientes del día");
            System.out.println("3. Generar Diagnóstico");
            System.out.println("4. Prescribir Receta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(">> Iniciando módulo de atención de citas...");
                    break;
                case 2:
                    System.out.println(">> Mostrando lista de pacientes agendados...");
                    break;
                case 3:
                    System.out.println(">> Abriendo módulo de ingreso de diagnóstico...");
                    break;
                case 4:
                    System.out.println(">> Creando nueva receta médica...");
                    break;
                case 5:
                    System.out.println("Cerrando sesión...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    // --- SOBRECARGA 2: Menú para PACIENTE ---
    // Recibe un objeto de tipo Paciente
    public void mostrarMenu(Paciente paciente) {
        int opcion = 0;
        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Agendar una nueva cita");
            System.out.println("2. Ver todas las citas programadas del paciente");
            System.out.println("3. Ver historial médico");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(">> Buscando horarios disponibles para agendar...");
                    // Aquí llamarías a la lógica de agendamiento
                    break;
                case 2:
                    System.out.println(">> Listando sus próximas citas...");
                    break;
                case 3:
                    System.out.println(">> Accediendo al historial médico...");
                    // paciente.obtenerHistorial();
                    break;
                case 4:
                    System.out.println("Cerrando sesión...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public void mostrarMenu(Farmaceutico farmaceutico) {
        int opcion = 0;
        do {
            System.out.println("\n--- SISTEMA DE FARMACIA ---");
            System.out.println("Farmaceutico: " + farmaceutico.getNombre());
            System.out.println("1. Dispensar Medicamento (Venta)");
            System.out.println("2. Verificar Stock de Medicina");
            System.out.println("3. Agregar o quitar medicamentos del inventario");
            System.out.println("4. Generar Factura");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(">> Iniciando ingreso de código de medicamento a dispensar...");
                    // farmaceutico.dispensarMedicamento(receta);
                    break;
                case 2:
                    System.out.println(">> Consultando a la base de datos de medicinas...");
                    break;
                case 3:
                    System.out.println(">> Abriendo panel de manejo de inventario...");
                    break;
                case 4:
                    System.out.println(">> Generando factura...");
                    break;
                case 5:
                    System.out.println("Cerrando sesión...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

}
