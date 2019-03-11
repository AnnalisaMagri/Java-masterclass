public class Main {

    public static void main(String[] args) {

        class Hamburger {
            private String rolltype, meat, name, add1Name, add2Name, add3Name, add4Name;
            private double price, add1Price, add2Price, add3Price, add4Price;

            public Hamburger(String rolltype, String meat, String name, double price) {
                this.rolltype = rolltype;
                this.meat = meat;
                this.name = name;
                this.price = price;
            }

//           method for each addition to add them to the Burger
          public void add1 (String name, double price) {
                this.add1Name = name;
                this.add1Price=price;
            }
            public void add2 (String name, double price) {
                this.add2Name = name;
                this.add2Price=price;
            }
            public void add3 (String name, double price) {
                this.add3Name = name;
                this.add3Price=price;
            }
            public void add4 (String name, double price) {
                this.add4Name = name;
                this.add4Price=price;
            }

            public double finalPrice() {
                double price=this.price;
                if (this.add1Name != null) {
                    price+= this.add1Price;
                    System.out.println(this.add1Name + " added to "+ this.name +". ");
                }
                if (this.add2Name != null) {
                    price+= this.add1Price;
                    System.out.println(this.add2Name + " added to "+ this.name +". ");
                }
                if (this.add3Name != null) {
                    price+= this.add3Price;
                    System.out.println(this.add3Name + " added to "+ this.name +". ");
                }
                if (this.add4Name != null) {
                    price+= this.add4Price;
                    System.out.println(this.add4Name + " added to "+ this.name +". ");
                }
                return price;
            }
        }

        class HealthyBurger extends Hamburger{

            private String add5Name, add6Name;
            private double add5Price, add6Price;

            public HealthyBurger(String meat, double price) {
                super("Brown Bread", meat, "HeaBur", price);
            }

            public void add5 (String name, double price) {
                this.add5Name = name;
                this.add5Price=price;
            }
            public void add6 (String name, double price) {
                this.add6Name = name;
                this.add5Price=price;
            }

            @Override
            public double finalPrice() {
                double healthPrice= super.finalPrice();
                if (this.add5Name!=null){
                    healthPrice+=this.add5Price;
                }
                if (this.add6Name!=null){
                    healthPrice+=this.add6Price;
                }
                return healthPrice;
            }
        }

        class Deluxe extends Hamburger{
            public Deluxe(){
                super("Brown bread", "Bacon", "Deluxe", 13);
                super.add1("Coke", 2);
                super.add2("fries", 1.1);
            }

            @Override
            public void add1(String name, double price) {
                System.out.println("Addition not allowed");
            }

            @Override
            public void add2(String name, double price) {
                System.out.println("Addition not allowed");
            }

            @Override
            public void add3(String name, double price) {
                System.out.println("Addition not allowed");
            }

            @Override
            public void add4(String name, double price) {
                System.out.println("Addition not allowed");
            }
        }



        Hamburger myBurger=new Hamburger("White", "tofu", "tofBur", 4.2);
        myBurger.add1("Tomato", 1);
        myBurger.add2("Lettuce", 4);
        System.out.println(myBurger.finalPrice());
        HealthyBurger Healburger=new HealthyBurger("Veggy", 12.1);
        Healburger.add5("eggplant", 4);
        System.out.println(Healburger.finalPrice());
        Deluxe newdeluxe= new Deluxe();
        newdeluxe.add1("Addition", .7);
        newdeluxe.finalPrice();
    }
}

