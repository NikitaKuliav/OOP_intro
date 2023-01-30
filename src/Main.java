public class Main {
    public static void main(String[] args) {

        Auto ladaGranta = new Auto();

        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.year = 2015;
        ladaGranta.country = "Russia";
        ladaGranta.color = "Yellow";
        ladaGranta.engineVolume = 1.7;

        Auto audiA8 = new Auto();

        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.year = 2020;
        audiA8.country = "Germany";
        audiA8.color = "Black";
        audiA8.engineVolume = 3.0;

        Auto bmwZ8 = new Auto();

        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.year = 2021;
        bmwZ8.country = "Germany";
        bmwZ8.color = "Black";
        bmwZ8.engineVolume = 3.0;

        Auto kia = new Auto();

        kia.brand = "KIA";
        kia.model = "Sportage 4-го поколения";
        kia.year = 2018;
        kia.country = "South Korea";
        kia.color = "Red";
        kia.engineVolume = 3.0;

        Auto hyundai = new Auto();

        hyundai.brand = "hyundai";
        hyundai.model = "Avante";
        hyundai.year = 2016;
        hyundai.country = "South Korea";
        hyundai.color = "Orange";
        hyundai.engineVolume = 1.6;

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kia);
        System.out.println(hyundai);



    }
}