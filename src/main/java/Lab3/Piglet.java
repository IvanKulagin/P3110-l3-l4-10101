public class Piglet extends Animal implements UseArmchair{

    Piglet(String name, Location l) {
        super(name, l);
        System.out.println("Создан поросёнок " + name + " в локации " + l.getName());
    }

    @Override
    public void sit(Armchair armchair) {
        if (getLocation() == armchair.getLocation()) {
            System.out.println(getName() + " сел в кресло");
        }
    }
}
