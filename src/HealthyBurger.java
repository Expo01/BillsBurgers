public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;

    }
}
