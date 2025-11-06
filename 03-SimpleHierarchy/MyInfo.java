class Vehicle{
    String brand;

    void start(){
        System.out.println(brand + " Vehicle started");
    }


}

class Car extends Vehicle{
    void drive(){
        System.out.println(brand + " Car is driving");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.start();
        myCar.drive();
    }
}
