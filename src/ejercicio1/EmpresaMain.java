package ejercicio1;

import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class EmpresaMain {
    public static void main(String[] args) throws Exception {
        EmpleadoDao empleadoDao= new EmpleadoDao();


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = sdf.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del empleado (dd/MM/yyyy) :"));
        Date dateEntry = sdf.parse(JOptionPane.showInputDialog("Ingrese la fecha de ingreso  empleado (dd/MM/yyyy) :"));
        double basicSalary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico del empleado :"));
        Empleado empleado = new Empleado("Juan", "Perez", "Masculino", birthDate, dateEntry, basicSalary);


        empleadoDao.saveEmpleado(empleado);


        String[] opciones = {"Visualizar información", "Modificar salario", "Calcular edad", "Calcular antigüedad", "Calcular prestaciones","Salir del programa"};
        while (true){
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch(opcion) {
                case 0:
                    empleadoDao.visualizarInformacion(empleado);
                    break;
                case 1:
                    double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:"));
                    empleadoDao.modificarSalario(empleado, nuevoSalario);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "La edad del empleado es: " + empleadoDao.calcularEdad(empleado));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "La antigüedad del empleado es: " + empleadoDao.calcularAntiguedad(empleado));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Las prestaciones del empleado son: " + empleadoDao.calcularPrestaciones(empleado));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no valida");
            }
        }
    }}
