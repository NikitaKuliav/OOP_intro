public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;



    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {this.brand = brand;}
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {this.model = model;}
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {this.engineVolume = engineVolume;}
        if (color == null || color.equals("")) {
            this.color = "White";
        } else {this.color = color;}
        if (year <= 0) {
            this.year = 2000;
        } else {this.year = year;}
        if (country == null || country.equals("")) {
            this.country = "default";
        } else {this.country = country;}
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
