public class Main {
    public static void main(String[] args) {


        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Lada Granta";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.color = "желтый";
        ladaGranta.productionYear = 2015;
        ladaGranta.productionCountry = "Россия";

        System.out.println(ladaGranta);


        Car AudiA8 = new Car();
        AudiA8.brand = "Audi";
        AudiA8.model = "Audi A8 50 L TDI quattro";
        AudiA8.engineVolume = 3.0;
        AudiA8.color = "черный";
        AudiA8.productionYear = 2020;
        AudiA8.productionCountry = "Германия";

        System.out.println(AudiA8);


        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "BMW Z8";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.color = "черный";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Германия";

        System.out.println(bmwZ8);


        Car KiaSportage = new Car();
        KiaSportage.brand = "Kia";
        KiaSportage.model = "Kia Sportage 4-го поколения";
        KiaSportage.engineVolume = 2.4;
        KiaSportage.color = "красный";
        KiaSportage.productionYear = 2018;
        KiaSportage.productionCountry = "Южная Корея";

        System.out.println(KiaSportage);


        Car HyundaiAvante = new Car();
        HyundaiAvante.brand = "Hyundai";
        HyundaiAvante.model = "Hyundai Avante";
        HyundaiAvante.engineVolume = 1.6;
        HyundaiAvante.color = "оранжевый";
        HyundaiAvante.productionYear = 2016;
        HyundaiAvante.productionCountry = "Южная Корея";

        System.out.println(HyundaiAvante);
    }
}