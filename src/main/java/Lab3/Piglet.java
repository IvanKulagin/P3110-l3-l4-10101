public class Piglet extends Animal {

    Piglet(String name, Location l) {
        super(name, l);
        System.out.println("Создан поросёнок " + name + " в локации " + l.getName());
    }
}
