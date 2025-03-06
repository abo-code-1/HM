package lecture_package.Lecture4;

public class HW_from_Lecture_4_3 {
    public static void main(String[] args) {

        Engine[] engines = new Engine[4];

        engines[0] = new FerrariEngine(3.8, 8, 145, 0.24);
        engines[1] = new FerrariEngine(4.5, 12, 170, 0.28);

        engines[2] = new RenaultEngine(4.2, 12, 160, 65);
        engines[3] = new RenaultEngine(3.8, 8, 155, 58);

        for (Engine engine : engines) {
            System.out.println("Max Speed: " + engine.getMaxSpeed());
        }
    }
}


abstract class Engine{
    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    abstract double efficiency();

    abstract double throttleEnergy();

    abstract double breakEnergy();

    public double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
}


class FerrariEngine extends Engine{

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight, double efficiency) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.efficiency = efficiency;
    }
    double efficiency = 0.25;

    @Override
    public double throttleEnergy() {
        return engineVolume*cylinderAmount*100;
    }

    @Override
    public double breakEnergy() {
        return engineWeight*2;
    }

    @Override
    double efficiency() {
        return efficiency;
    }
}



class RenaultEngine extends Engine{

    double extraTurboEnergy;
    double efficiency = 0.27;

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }
    @Override
    double efficiency() {
        return efficiency;
    }

    @Override
    double throttleEnergy() {
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }

    @Override
    double breakEnergy() {
        return engineWeight*2.1;
    }
}