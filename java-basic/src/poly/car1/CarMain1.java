package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setCar(new K3Car());
        driver.driver();

        driver.setCar(new Model3Car());
        driver.driver();

        driver.setCar(new NewCar());
        driver.driver();
    }
}
