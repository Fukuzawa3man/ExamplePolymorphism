/**
 * オーバーライドとポリモーフィズムの例。
 */

//import java.lang.Override;

class Vehicle {
    int maxSeed = 5; // 5km/h
    public void move(){
        System.out.println("乗り物が最大速度" + maxSeed + "km/hで移動します。");
    }
}

class Bus extends Vehicle {
    public Bus(){
        maxSeed = 50;
    }

    @Override
    public void move(){
        System.out.println("バスが最大速度" + maxSeed + "km/hで移動します。各バス停に到着次第止まります。");
    }

    public void pickup(){}
    public void dropout(){}
}

class DumpCar extends Vehicle {
    int maxLoad = 10; // 10 ton
    public DumpCar(){
        maxSeed = 80;
    }

    @Override
    public void move(){
        System.out.println("ダンプカーが最大速度" + maxSeed + "km/hで高速道路を移動します。");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Bus();
        vehicles[1] = new Bus();
        vehicles[2] = new Bus();
        vehicles[3] = new DumpCar();
        vehicles[4] = new DumpCar();

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
