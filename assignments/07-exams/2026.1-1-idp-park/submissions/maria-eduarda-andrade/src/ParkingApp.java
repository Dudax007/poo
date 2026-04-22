import java.util.ArrayList;
import java.util.List;

public class ParkingApp {
    public static void main(String[] args) {
        
        List<Vehicle> veiculos = new ArrayList<>();

        
        veiculos.add(new Car("MEA-3108", "Honda", "Civic"));
        veiculos.add(new Motorcycle("ASM-2005", "Honda", "CB 1000"));
        veiculos.add(new Truck("ABC-1234", "Dodge Ram", "3500"));

        int horas = 4;

        for (Vehicle veiculo_atual : veiculos) { 
            double fee = veiculo_atual.calculateParkingFee(horas);
            System.out.println(veiculo_atual);
            System.out.printf("Valor a pagar por %dh: R$ %.2f%n%n", horas, fee);
        }

    }
}