public class Account {
    private String number;
    private double balance;
    private String name;
    private  String email;
    private String telephone;

    //CONSTRUCTOR
    public Account(){
        //"this" needs to be the fist line, default parameters
        // it will call the constructor with parameters
        this("default accountnumber", 1, "default name", "default email", "default telephone");
        System.out.println("Empty constructor");
    }

    public Account(String name, String email, String telephone) {
        //some default then calling the main constructor
        this("123", 10.10,   name,  email,  telephone);
//        this.name = name;
//        this.email = email;
//        this.telephone = telephone;
        System.out.println("Constructor with some parameters only");

    }

    public Account(String number, double balance, String name, String email, String telephone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.telephone=telephone;


    }


    public void deposit(double depositamount){
        this.balance+=depositamount;
        System.out.println("Deposit of " + depositamount +"processed. New Balance is "+ this.balance);
    }
    public void withdraw(double withdrawamount){
        if (withdrawamount>this.balance)//if (this.balance-withdrawamount<0)
        {
            System.out.println("Not enough balance. Only " + this.balance + " available");
        }else{
            this.balance-=withdrawamount;
        System.out.println("Withdraw of "+ withdrawamount + " processed. New balance is "+ this.balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
