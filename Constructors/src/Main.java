public class Main {

    public static void main(String[] args) {

        // do not need the following if we use a constructor
        //this is the procedure without contructors
//        Account myaccount= new Account();
//        myaccount.setName("Anna");
//        myaccount.setEmail("email@email.com");
//        myaccount.setNumber("212");
//        myaccount.setTelephone("01234556");
//        myaccount.setBalance(3000);

        //with constructor
        Account myaccount=new Account("3232", 3452, "Anna", "email@email.com", "01234556" );
        myaccount.withdraw(2);
        System.out.println(myaccount.getEmail());

        //with  empty constructor
        System.out.println("MyAcoount2");
        //with default parameters, it will call first the constr w parameters and then the empty one
        Account myaccount2= new Account();

        //with  some constructor
        System.out.println("MyAccount3");
        Account myaccount3=new Account("Michal", "email@it.it", "5445454");
        //taking balance from the default parameters
        System.out.println("Name: " + myaccount3.getName() + ", Balance: "+ myaccount3.getBalance());

        //VipAccount
        VipAccount vip1=new VipAccount();
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip1.getEmail());

        VipAccount vip2=new VipAccount("Pat", "pat@e.et");
        System.out.println(vip2.getCreditLimit());

        VipAccount vip3=new VipAccount("Sam", "sam@aa.bb", 101010);
        System.out.println(vip3.getName());

        //Wall class and area calculator
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());


        //Point

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        //CarpetCost
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet= new Carpet(1);
        floor=new Floor(1,1);
        calculator= new Calculator(floor,carpet);
        System.out.println("total= " + calculator.getTotalCost());

        //complex numbers
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());



    }

}
