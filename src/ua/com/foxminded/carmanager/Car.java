package ua.com.foxminded.carmanager;

public class Car {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;

    public Car(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void addDistance(int additinalDistance) {
        distance += additinalDistance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                '}';
    }
}
