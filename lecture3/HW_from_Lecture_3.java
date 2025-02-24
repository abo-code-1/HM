package lecture_package.lecture3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class HW_from_Lecture_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<User> db = new ArrayList<>();

        // --------------- Adding Data
        User user1 = new User(1, "user122", "W13579", "Abrorkhon", "Imamsidikov");

        User user2 = new User(2, "Claretta", "tF8_PExuD_E.", "Ave", "Slocum");


        Staff staff1 = new Staff(3, "telan0", "qS0(!1>za1fe34", "Tann",
                "Elan", 1792.2);

        Staff staff2 = new Staff(4, "ydragge1", "sC2@etK'0k)n9Z2", "Yvon",
                "Dragge", 689);

        db.add(staff1);
        db.add(staff2);


        Student student1 = new Student(5, "lding2", "zK3%VU9TNgm", "Luigi",
                "Ding", 3.2);

        Student student2 = new Student(6, "kganders3", "rC0.VEKVW&29032", "Kissie",
                "Ganders", 3.5);


        db.add(student1);
        db.add(student2);
        db.add(staff1);
        db.add(staff2);


        // --------------- System logic


        boolean check = true;
        while (check) {
            int id = 0;
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            int choose = sc.nextInt();

            if (choose == 1) {
                System.out.println("PRESS [1] ADD STUDENT:");
                System.out.println("PRESS [2] TO ADD STAFF");
                int choose2 = sc.nextInt();
                if (choose2 == 1) {
                    Student st = new Student();
                    st.setId(id);
                    id++;
                    System.out.println("Enter student login: ");
                    st.setName(sc.next());
                    System.out.println("Enter student password: ");
                    st.setPassword(sc.next());
                    System.out.println("Enter student name: ");
                    st.setName(sc.next());
                    System.out.println("Enter student surname: ");
                    st.setSurname(sc.next());
                    System.out.println("Enter student GPA: ");
                    st.setGpa(sc.nextDouble());
                    db.add(st);

                } else if (choose2 == 2) {
                    Staff staff = new Staff();
                    staff.setId(id);
                    id++;
                    System.out.println("Enter staff login: ");
                    staff.setName(sc.next());
                    System.out.println("Enter staff password: ");
                    staff.setPassword(sc.next());
                    System.out.println("Enter staff name: ");
                    staff.setName(sc.next());
                    System.out.println("Enter staff surname: ");
                    staff.setSurname(sc.next());
                    System.out.println("Enter staff salary: ");
                    staff.setSalary(sc.nextDouble());
                    db.add(staff);
                }
            } else if (choose == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS:");
                System.out.println("PRESS [2] TO LIST  STAFFS:");
                int choose2 = sc.nextInt();
                if (choose2 == 1) {
                    showAllStudents(db);
                } else if (choose2 == 2) {
                    showAllStaffs(db);
                }
            }
        }
    }

    public static void showAllStudents(ArrayList<User> users) {
        for(User u: users) {
            if(u instanceof Student) {
                System.out.println("Student name: "+ u.getName() + " Student GPA: "
                        + ((Student) u).getGpa() + " Student courses: "
                );
                ((Student) u).show_courses();
            }
        }
    }
    public static void showAllStaffs(ArrayList<User> users) {
        for(User u: users) {
            if(u instanceof Staff) {
                System.out.println("Student name: "+ u.getName() + " Staff Salary: "
                        + ((Staff) u).getSalary() + " Subjects: ");
                ((Staff) u).show_subjects();
            }
        }
    }

}




class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

class Staff extends User {
    private double salary;
    private int indexOfSubject = 0;
    private String[] subjects = new String[100];

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.indexOfSubject = 0;
    }

    public Staff(){}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIndexOfCourses() {
        return indexOfSubject;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfSubject = indexOfCourses;
    }


    public void addSubject (String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;

    }


    public void show_subjects(){
        int index = this.indexOfSubject;
        for(int i = 0; i < index; i++){
            if(this.subjects[i] != null){
                System.out.println(this.subjects[i]);
            };
        }
    }


    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", subjects=" + Arrays.toString(subjects) +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


class Student extends User{
    private double gpa;
    private int indexOfCourses = 0;
    private String[] courses = new String[100];

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.indexOfCourses = 0;
    }

    public Student(){}

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    public void addCourses (String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public void show_courses(){
        int index = this.indexOfCourses;
        for(int i = 0; i < index; i++){
            if(this.courses[i] != null ){
                System.out.println(this.courses[i]);
            }
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", indexOfCourses=" + indexOfCourses +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}





