class Car{
    private String brand;
    private int speed;

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    String getBrand(){
        return brand;
    }

    int getSpeed(){
        return speed;
    }

    void displayInfo(){
        System.out.println("Car brand: " + brand + ", Speed: " + speed + "km/h");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("GTR R35");
        myCar.setSpeed(320);
        myCar.displayInfo();
    }
}
