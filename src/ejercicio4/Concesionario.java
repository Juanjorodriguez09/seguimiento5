package ejercicio4;
import java.util.ArrayList;
public class Concesionario {
    private String name;
    private String address;

    private ArrayList<String> cars;


    public Concesionario(String name, String address) {
        this.name = name;
        this.address = address;

        this.cars = new ArrayList<>();
    }

    public ArrayList<String> getCars() {
        return cars;
    }

    public void addCar(String car){
        cars.add(car);
    }

    public boolean deleteCar(String car){
        return cars.remove(car);
    }


    public void setCars(ArrayList<String> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getNumberOfCars() {
        return this.cars.size();
    }
}

