public class Hamburger {
    private String name;
    private String meat;
    private String bread;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat,double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;

    }

    public Hamburger() {

    }

    public void addHamburgerAddition1 (String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.printf("added %s for an extra %s%n", name, price);
    }
    public void addHamburgerAddition2 (String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.printf("added %s for an extra %s%n", name, price);
    }
    public void addHamburgerAddition3 (String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.printf("added %s for an extra %s%n", name, price);
    }
    public void addHamburgerAddition4 (String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.printf("added %s for an extra %s%n", name, price);
    }

    public double itemizeHamburger (){
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
