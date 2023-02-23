package ua.com.foxminded.carmanager;

public class CarManager {
    public static void main(String[] args) {
        Car prius = new Car("Toyota Prius", 2008, 15000, 1200, Color.GREEN);

        Car renault = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE); //delete this row
        Car renault2 = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);


        Motorcycle suzuki = new Motorcycle("YSuzuki GSX-R1000", 2021, 16000, 600, "black", "diesel", true);
        Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false);


        prius.addDistance(1000);//delete this row


        System.out.println(prius);
        System.out.println(renault);//delete this row
        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(suzuki.equals(yamaha));

    }


}
