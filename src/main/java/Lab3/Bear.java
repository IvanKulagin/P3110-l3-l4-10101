import java.util.ArrayList;

public class Bear extends Animal implements UseBuffet {
    Bear(String name, Location l) {
        super(name, l);
        System.out.println("Создан медведь " + name + " в локации " + l.getName());
    }

    @Override
    public void checkBuffet(Buffet buffet) {
        if (getLocation() == buffet.getLocation()) {
            System.out.println(getName() + " открыл буфет");
        }
    }
}
