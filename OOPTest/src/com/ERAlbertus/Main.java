package com.ERAlbertus;
class Hamburger {
    private String name;
    private String breadType;
    private String meat;
    private double basePrice;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, String breadType, String meat, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public double getTotalPrice (){
        double totalPrice = this.basePrice
                + addition1.getAdditionPrice()
                + addition2.getAdditionPrice()
                + addition3.getAdditionPrice()
                + addition4.getAdditionPrice();
        return totalPrice;

    }

    public String getName() {
        return name;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
        System.out.println(addition1.getName() + " added to Burger");
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
        System.out.println(addition2.getName() + " added to Burger");
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
        System.out.println(addition3.getName() + " added to Burger");
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
        System.out.println(addition4.getName() + " added to Burger");
    }
}
class HealthyBurger extends Hamburger {
   private Addition addition5;
   private Addition addition6;

    public HealthyBurger(String name, String meat, double basePrice) {
        super(name, "Brown Rye Bread Roll", meat, basePrice);

    }

    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

    public void setAddition5(Addition addition5) {
        this.addition5 = addition5;
        System.out.println(addition5.getName() + " added to Burger");
    }

    public void setAddition6(Addition addition6) {
        this.addition6 = addition6;
        System.out.println(addition6.getName() + " added to Burger");
    }


}
class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String name, String breadType, String meat, double basePrice) {
        super(name, breadType, meat, basePrice);
        super.setAddition1(new Addition("chips", 0.99) );
        super.setAddition2(new Addition ("drink", 1.49) );
        super.setAddition3(new Addition("nothing", 0.00) );
        super.setAddition4(new Addition("nothing", 0.00) );
    }

    @Override
    public void setAddition1 (Addition addition) {
        System.out.println("No additions allowed on DeluxeBurger");

    }
    @Override
    public void setAddition2 (Addition addition) {
        System.out.println("No additions allowed on DeluxeBurger");

    }
    @Override
    public  void setAddition3 (Addition addition) {
        System.out.println("No additions allowed on DeluxeBurger");

    }
    @Override
    public void setAddition4 (Addition addition) {
        System.out.println("No additions allowed on DeluxeBurger");

    }
}
class Addition {
    private String name;
    private double additionPrice;

    public Addition(String name, double additionPrice) {
        this.name = name;
        this.additionPrice = additionPrice;
    }

    public String getName() {
        return name;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }
}
public class Main {

    public static void main(String[] args) {
        // The purpose of the application is to help a fictitious company called Bills Burgers to manage
        // their process of selling hamburgers.
        // Our application will help Bill to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.
        // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
        // The basic hamburger should have the following items.
        // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        // the customer can select to be added to the burger.
        // Each one of these items gets charged an additional price so you need some way to track how many items got added
        // and to calculate the final price (base burger with all the additions).
        // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat and price, can also include name of burger or you
        // can use a setter.
        // Also create two extra varieties of Hamburgers (subclasses) to cater for
        // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
        // The healthy burger can have 6 items (Additions) in total.
        // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
        // not the base class (Hamburger), since the two additions are only appropriate for this new class
        // (in other words new burger type).
        // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
        // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
        // object is created, and then prevent other additions being made.
        //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
        // burger (base price + all additions)
        // For the two additional classes this may require you to be looking at the base class for pricing and then
        // adding totals to final price.

        Hamburger hamburger = new Hamburger("basicBurger", "seasame seed bun", "single beef patty", 5.99);
        System.out.println("Base price: " + hamburger.getBasePrice());
        System.out.println("Name: " + hamburger.getName());
        System.out.println("Roll Type: " + hamburger.getBreadType());
        System.out.println("Meat: " + hamburger.getMeat());

        Addition bacon = new Addition("Bacon", 0.99);
        Addition avocado = new Addition("Avocado", 1.50);
        Addition mushrooms = new Addition ("Mushrooms", 0.50);
        Addition cheddarCheese = new Addition ("cheddar cheese", 0.50);
        Addition lettuce = new Addition ("Lettuce", 0.50);
        Addition tomato = new Addition ("Tomato", 0.50);
        Addition grilledOnion = new Addition ("grilled onion", 0.50);

        hamburger.setAddition1(bacon);
        hamburger.setAddition2(avocado);
        hamburger.setAddition3(mushrooms);
        hamburger.setAddition4(cheddarCheese);

        System.out.println("Total Price is: " + hamburger.getTotalPrice());

        System.out.println("*****************************************");
        HealthyBurger healthyBurger = new HealthyBurger("healthy burger",  "beef patty", 6.99);

        healthyBurger.setAddition1(lettuce);
        healthyBurger.setAddition2(avocado);
        healthyBurger.setAddition3(mushrooms);
        healthyBurger.setAddition4(tomato);
        healthyBurger.setAddition5(grilledOnion);
        healthyBurger.setAddition6(cheddarCheese);

        System.out.println("bread type is : "  + healthyBurger.getBreadType() );
        System.out.println("Total Price is: " + healthyBurger.getTotalPrice());

        System.out.println("*****************************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger("deluxe", "kaiser roll", "double beef patty", 7.99);

        deluxeBurger.getAddition1();
        deluxeBurger.getAddition2();
        deluxeBurger.setAddition1(grilledOnion);
        deluxeBurger.setAddition3(bacon);
        System.out.println("Total price is: " +deluxeBurger.getTotalPrice() );
    }
}
