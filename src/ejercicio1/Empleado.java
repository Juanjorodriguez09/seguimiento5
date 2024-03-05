package ejercicio1;




import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;


public class Empleado {
    private String name;
    private String lastName;
    private String gender;
    private Date birthDate;
    private Date dateEntry;
    private double basicSalary;

    public Empleado(String name, String lastName, String gender, Date birthDate, Date dateEntry, double basicSalary) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.dateEntry = dateEntry;
        this.basicSalary = basicSalary;
    }

    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        LocalDate fechaNac = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(fechaNac, ahora).getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(Date dateEntry) {
        this.dateEntry = dateEntry;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}