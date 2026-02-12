import lab2.problema3.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculeFactoryTest {
    @Test
    void factoryShouldCreateCar() {
        Category strategy = new EconomicCategory();
        Vehicule vehicle = VehiculeFactory.createVehicule("carro", strategy);

        assertNotNull(vehicle);
        assertTrue(vehicle instanceof LandVehicule);
    }

    @Test
    void factoryShouldCreatePlane() {
        Category strategy = new LuxuryCategory();
        Vehicule vehicle = VehiculeFactory.createVehicule("avion", strategy);

        assertNotNull(vehicle);
        assertTrue(vehicle instanceof AirVehicule);
    }
}
