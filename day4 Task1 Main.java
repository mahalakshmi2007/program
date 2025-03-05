class Vehicle {
  public void start() {
    System.out.println("vehicle is starting");
  }
}

class Car extends Vehicle {
  public void start() {
    System.out.println("car is starting");
  }
}

class Bike extends Vehicle {
  public void start() {
    System.out.println("bike is starting");
  }
}
public class Main{
  public static void main(String[] args){
    Vehicle vehicle;
    vehicle = new Car();
    vehicle.start();
    vehicle = new Bike();
    vehicle.start();
  }
}
