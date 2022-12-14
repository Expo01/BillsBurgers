public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super();
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add additional items to a delux burger");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("delux burger meal includes drink and chips");
        return 19.10;
    }
}
