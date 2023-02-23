package ua.com.foxminded.carmanager;

import java.util.Objects;

public class Motorcycle {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    Boolean isReadyToDrive;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String colorString, String engineType, Boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        colorString = colorString.replace(" ", "");
        colorString = colorString.toUpperCase();
        this.color = Color.valueOf(colorString);
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;


    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color.getTxt() + '\'' +
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return color == that.color && Objects.equals(isReadyToDrive, that.isReadyToDrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isReadyToDrive);
    }
}

