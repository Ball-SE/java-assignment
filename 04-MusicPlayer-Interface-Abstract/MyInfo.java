interface Playable{
    void play();
}

abstract class MusicDevice {
    String brand;
    
    void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }
    
    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable{
    public void connect(){
        System.out.println("เชื่อมต่อแผ่น CD...");
    }

    public void play(){
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

class Smartphone extends MusicDevice implements Playable{
    public void connect(){
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }

    public void play(){
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        Smartphone smartphone = new Smartphone();
        cdPlayer.brand = "Sony";
        cdPlayer.info();
        cdPlayer.connect();
        cdPlayer.play();

        smartphone.brand = "Apple";
        smartphone.info();
        smartphone.connect();
        smartphone.play();

    }
}
