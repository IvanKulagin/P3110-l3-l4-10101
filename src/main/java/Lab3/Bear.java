public class Bear extends Animal implements Buffet {
    Bear(String name, Location l) {
        super(name, l);
        System.out.println("Создан медведь " + name + " в локации " + l);
    }

    @Override
    public void checkBuffet() {
        if (getLocation() == Location.HOUSE) {
            System.out.println(getName() + " открыл буфет");
        }
    }
}
