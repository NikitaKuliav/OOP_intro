public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return
                "Марка = " + brand +
                ", модель = " + model +
                ", объем двигателя = " + engineVolume +
                ", цвет = " + color +
                ", год производства = " + year +
                ", страна сборки = " + country;
    }
}
