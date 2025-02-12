package lecture_package.Lecture2;

public class HM_from_Lecture_2_1{
    public static void main(String[] args) {

        Mercedes ms = new Mercedes("Mercedes", "S Class", "300", 2011, 2.6, "S class");
        System.out.println(ms.ride());
    }
}


class Car{
    private String name;
    private String model;
    private String maxSpeed;
    private int year;
    private double volume;


    public Car(String name, String model, String maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    //-----------------------------------------------------------------------------

    public String ride(){
        return "Car is riding" + getMaxSpeed() + "km/h, " + getYear() + " year " + getVolume()  + "volume";
    }
}


class Mercedes extends Car {
    private String classType;
    public Mercedes(String name, String model, String maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public Mercedes(){}


    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }


    @Override
    public String ride(){
        return  "Car is riding " +  getMaxSpeed() + "km/h, " + getYear() + " year " + getVolume()  + "volume " + "Class type " + getClassType();
    }
}


class Toyota extends Car {
    private String manufacturer;

    public Toyota(String name, String model, String maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public Toyota(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String ride(){
        return( "Car is riding " + getMaxSpeed() + "km/h, " + getYear() + " year "
                + getVolume()  + "volume "+ " manufacture" +getManufacturer());
    }
}




