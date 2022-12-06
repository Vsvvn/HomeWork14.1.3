public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return "Автомобиль марки " + brand + ", модель " + model + ", " + productionYear + " года выпуска," +
                " страна сборки " + productionCountry + ", цвет " + color + ", объем двигателя — " + engineVolume
                + " л.";
    }
}
