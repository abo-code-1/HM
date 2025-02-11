package lecture_package.Lecture1;

public class HM_from_Lecture_1_2 {
    public static void main(String[] args) {
        Account user1 = new Account();
        user1.setId(1);
        user1.setUser_name("Abror");
        user1.setBalance(1000.23);
        user1.setAnnualInterestRate(0.01);


        System.out.println(user1.getMonthlyInterestRate());
        System.out.println(user1.getMonthlyInterest());
        user1.withdraw(100.2);
        System.out.println(user1.getBalance());
        System.out.println(user1.getMonthlyInterest());
        user1.deposit();
        System.out.println(user1.getBalance());


    }
}

class Account{
    private int id;
    private String user_name;
    private double balance;
    private double annualInterestRate;

    public Account(int id, String user_name, double balance, double annualInterestRate) {
        this.id = id;
        this.user_name = user_name;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public  Account() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //---------------------------------------------------------


    public double getMonthlyInterestRate(){
        return this.getAnnualInterestRate();
    }

    public double getMonthlyInterest(){
        return getAnnualInterestRate()*this.balance;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(){
        this.balance += (this.annualInterestRate * this.balance);
    }
}
