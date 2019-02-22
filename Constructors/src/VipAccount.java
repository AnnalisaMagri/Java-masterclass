import java.sql.SQLOutput;

public class VipAccount {
    private String name;
    private String email;
    private double creditLimit;

    //1st contructor with empty parameters
    public VipAccount(){
        this("Default name", "Default email", 12345.0);
        System.out.println("Constructor with empty parameters");
    }

    //2nd contructor with 2 parameters, and 3rd default
    public VipAccount(String name, String email){
        this(name, email,345);
        System.out.println("Constructor with 2 parameters");
    }
    //3rd contructor with 3 parameters
    public VipAccount(String name, String email, double creditLimit){
        System.out.println("Constructor with 3 parameters");
        this.name=name;
        this.email=email;
        this.creditLimit=creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
