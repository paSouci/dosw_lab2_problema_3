import lab2.problema3.*;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class General {
    @Test
    void vehicleShouldCalculateCorrectPriceWithStrategy() {
        Category strategy = new LuxuryCategory();
        Vehicule vehicle = new LandVehicule("Carro", 1000, strategy);
        assertEquals(1500, vehicle.calculatePrice());
    }

    @Test
    void streamShouldCalculateTotalPriceCorrectly() {
        Vehicule v1 = new LandVehicule("Carro", 1000, new EconomicCategory());
        Vehicule v2 = new LandVehicule("Motocicleta", 1000, new UsedCategory());

        List<Vehicule> vehicles = List.of(v1, v2);

        double total = vehicles.stream()
                .mapToDouble(Vehicule::calculatePrice)
                .sum();
        assertEquals(1700, total);
    }

    @Test
    void multipleLuxuryVehiculesShouldCalculateCorrectTotal() {
        Vehicule v1 = new AirVehicule("Avion", 2000, new LuxuryCategory());
        Vehicule v2 = new WaterVehicule("Bote", 1000, new LuxuryCategory());

        List<Vehicule> vehicles = List.of(v1, v2);

        double total = vehicles.stream()
                .mapToDouble(Vehicule::calculatePrice)
                .sum();
        assertEquals(4500, total);
    }
}
