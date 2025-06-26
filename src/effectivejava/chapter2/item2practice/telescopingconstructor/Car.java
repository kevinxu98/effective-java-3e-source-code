package effectivejava.chapter2.item2practice.telescopingconstructor;


public class Car {
  private final String color;
  private final String make;
  private final int year;
  private final int id;

  public Car(String color) {
    this(color, "");
  }

  public Car(String color, String make) {
    this(color, make, 0);
  }

  public Car(String color, String make, int year){
    this(color, make, year,  0);
  }

  public Car(String color, String make, int year, int id) {
    this.color = color;
    this.make = make;
    this.year = year;
    this.id = id;
  }

  public static void main(String[] args){
    Car car1 = new Car("black");
    Car car2 = new Car("black", "tesla");
  }
}