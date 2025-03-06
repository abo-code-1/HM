package lecture_package.Lecture4;

public class HW_from_Lecture_4_2 {
    public static void main(String[] args) {

        GoldShape[] goldShapes = {
                new SphereGold(2.5),
                new SphereGold(4.0),
                new SphereGold(6.3),
                new CubeGold(3.0),
                new CubeGold(5.5),
                new CubeGold(7.1)
        };

        for (GoldShape shape : goldShapes) {
            System.out.println("Price: " + shape.getPrice());
        }
    }
}

abstract class GoldShape{
    abstract double getVolume();
    public double getPrice(){
        return getVolume() * 250 + 1200;
    }
}

class SphereGold extends GoldShape{
    double radius;

    public SphereGold(double radius) {
        this.radius = radius;
    }
    SphereGold() {}

    @Override
    public double getVolume() {
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }
}



class CubeGold extends GoldShape{
    double side;

    public CubeGold(double side) {
        this.side = side;
    }
    CubeGold() {}

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}



