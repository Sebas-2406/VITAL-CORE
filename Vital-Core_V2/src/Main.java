import java.time.LocalDate;
import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Persona persona1= new Persona("17589625","Elvis","Cocho",);
        Paciente paciente1 = new Paciente("1757910482","Estefano","Chavez", LocalDate.of(2006, Month.JUNE, 24),"01", "B+", "Ninguna", LocalDate.now());
        GestorMenu menu = new GestorMenu();
        menu.mostrarMenu(paciente1);
    }
}