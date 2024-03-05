package ejercicio1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
public class EmpleadoDao {
    private ArrayList<Empleado> empleados;

    EmpleadoDao(){
        empleados = new ArrayList<>();
    }

    public void saveEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void visualizarInformacion(Empleado empleado) {
        String info = "Nombre: " + empleado.getName() + "\n"
                + "Apellido: " + empleado.getLastName() + "\n"
                + "Genero: " + empleado.getGender() + "\n"
                + "Fecha de Nacimiento: " + empleado.getBirthDate() + "\n"
                + "Fecha de Ingreso: " + empleado.getDateEntry() + "\n"
                + "Salario Basico: " + empleado.getBasicSalary();
        JOptionPane.showMessageDialog(null, info);
    }

    public void modificarSalario(Empleado empleado, double nuevoSalario) {
        empleado.setBasicSalary(nuevoSalario);
    }

    public int calcularEdad(Empleado empleado) {
        LocalDate ahora = LocalDate.now();
        Date birthDate = empleado.getBirthDate();
        LocalDate birthDa = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(birthDa, ahora).getYears();
    }

    public int calcularAntiguedad(Empleado empleado) {
        LocalDate ahora = LocalDate.now();
        Date dateEntry = empleado.getDateEntry();
        LocalDate fechaIng = dateEntry.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(fechaIng, ahora).getYears();
    }

    public double calcularPrestaciones(Empleado empleado) {
        int antiguedad = calcularAntiguedad(empleado);
        double basicSalary = empleado.getBasicSalary();
        return (antiguedad * basicSalary) / 12;
    }
}

