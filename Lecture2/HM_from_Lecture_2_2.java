package lecture_package.Lecture2;

public class HM_from_Lecture_2_2 {
    public static void main(String[] args){
        Gymnast gymnast = new Gymnast("Abror", 18, "Kazakhstan" , 185  , 85, "Super style");
        Footballer footballer = new Footballer("Raymond", 22, "Spain", "gool keeper", "Madrid");
        Swimmer swimmer = new Swimmer("Olga", 43, "Russia", "Super swim style", 24.2);

        OlympicGames olympicGames = new OlympicGames("Astana", 2023, gymnast, footballer, swimmer);
        System.out.println(olympicGames.showAllData());

    }
}

class Sportsman{
    private String fullname;
    private int age;
    private String country;

    public Sportsman(String fullName, int age, String country) {
        this.fullname = fullName;
        this.age = age;
        this.country = country;
    }

    public String getFullName() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String play(){
        return (getFullName() + " " + getAge() + " years  " + getCountry() + " is playing" );
    }
}


class Gymnast extends Sportsman{
    private int height;
    private int weight;
    private String style;

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String play() {
    return getFullName() + " " + getAge() + " years  " + getCountry() + " is playing," +
            " height:" + height + " weight:" + weight + " style:" + style;
    }
}


class Footballer extends Sportsman{
    private String position;
    private String club;
    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }


    @Override
    public String play() {
        return (getFullName() + " " + getAge() + " years  " + getCountry() + " is playing," +
                " position: " + getPosition() + " club:" + getClub());
    }
}


class Swimmer extends Sportsman{
    private String style;
    private double recordTime;
    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public String getStyle() {
        return style;
    }

    public double getRecordTime() {
        return recordTime;
    }

    @Override
    public String play() {
        return (getFullName() + " " + getAge() + " years  " + getCountry() + " is playing," +
                " style: " + getStyle() + " record time : " + getRecordTime());
    }
}


class OlympicGames{
    private String city;
    private int year;
    Gymnast gymnast;
    Footballer footballer;
    Swimmer swimmer;

    public OlympicGames(String city, int year, Gymnast gymnast, Footballer footballer, Swimmer swimmer) {
        this.city = city;
        this.year = year;
        this.gymnast = gymnast;
        this.footballer = footballer;
        this.swimmer = swimmer;
    }


    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    public Gymnast getGymnast() {
        return gymnast;
    }

    public Footballer getFootballer() {
        return footballer;
    }

    public Swimmer getSwimmer() {
        return swimmer;
    }

    public OlympicGames(){}


    public String showAllData(){
        String result = "";
        result +=
                gymnast.play() + " from city " + city + ", olympic game year: " + year + "\n" +
                footballer.play() + " from city " + city + ", olympic game year: " + year + "\n" +
                swimmer.play() + " from city " + city + ", olympic game year: " + year + "\n";
        return result;
    }
}
