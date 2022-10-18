import transport.*;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "СеДАн");
        Car bmw = new Car("BMW", "Z8", 2f, "Купе");
        Car hyundai = new Car("Hyundai", "Avante", 2.2f, null);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f, "");

        Truck kamaz = new Truck("Камаз", "6520", 9.8f, "Больше 12");
        Truck ford = new Truck("Ford", "Cargo 25", 9.0f, "");
        Truck howo = new Truck("Howo", "HW76", 9.8f, "pulsar");
        Truck isuzu = new Truck("Isuzu", "Forward", 7.8f, "3.5-12");


        audi.printType();
        kia.printType();
        bmw.printType();
        hyundai.printType();
        kamaz.printType();
        howo.printType();
        ford.printType();
        isuzu.printType();
        //kiaBus.printType();
       // intercityBus.printType();
        //touristBus.printType();
        //paz.printType();
    }
}

