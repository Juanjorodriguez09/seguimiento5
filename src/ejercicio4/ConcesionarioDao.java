package ejercicio4;
import java.util.ArrayList;
public class ConcesionarioDao {


    public class ConcesionarioDAO {
        private Concesionario concesionario;

        public ConcesionarioDAO(Concesionario concesionario){
            this.concesionario = concesionario;
        }

        public void addCar(Car car){
            concesionario.addCar(Car);
        }

        public boolean deleteCar(Car car){
            return concesionario.deleteCar(String.valueOf(car));
        }

        public String getInfo(){
            return "Nombre: " + concesionario.getName() + " Dirección: " + concesionario.getAddress() + " Número de carros: " + concesionario.getNumberOfCars();
        }

        public boolean sellCar(Car carro){
            return concesionario.deleteCar(String.valueOf(carro));
        }

        public void showCars(){
            ArrayList<String> carros = concesionario.getCars();
            for (String carro : carros) {

            }
        }

        @Override
        public String toString() {
            return "ConcesionarioDAO{" +
                    "concesionario=" + concesionario +
                    '}';
        }}

   }