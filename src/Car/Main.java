package Car;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.setMake("");
    car.setModel("Carrera");
    car.setDoors(2);
    car.setColor("black");
    car.setConvertible(true);

    System.out.println("make = " + car.getMake());
    System.out.println("model = " + car.getModel());

    car.describeCar();
  }
}
