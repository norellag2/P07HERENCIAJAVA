package vehiculos;

public class Car extends Vehiculo {
    private String brand;
    private String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    //Obligatoriamente tenemos que declarar los métodos de la superClase

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}
