package lecture_package.Lecture1;

public class HM_from_Lecture_1_1 {
    public static void main(String[] args) {
        Person ps_1 = new Person("Abror", "Imamsidikov", 18, 85, "men", "Almaty");
        System.out.println(ps_1);
    }
}

class Person{
    private String name;
    private String surname;
    private int age;
    private int weight;
    private String gender;
    private String citizenship;

    public Person(String name, String surname, int age, int weight, String gender, String citizenship) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.citizenship = citizenship;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}


