import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

abstract public class Animal implements Move, BodyParts {
    private Location l;
    private String name;
    private ArrayList<BodyPart> parts;
    private static ArrayList<Animal> animals = new ArrayList<>();

    Animal(String name, Location l) {
        this.name = name;
        this.l = l;
        parts = new ArrayList<>();
        animals.add(this);
    }

    String getName() {
        return name;
    }

    @Override
    public void setLocation(Location l) throws MoveToIndoorException{
        if (this.l.getType() == LocationType.INDOOR && l.getType() == LocationType.INDOOR){
            throw new MoveToIndoorException("Нельзя перейти из " + this.l.getName() + " в " + l.getName() + " не пройдя по улице");
        }
        else {
            this.l = l;
            System.out.println(name + " перемещён в локацию " + l.getName());
        }
    }

    @Override
    public Location getLocation() {
        return l;
    }

    @Override
    public void addParts(BodyPart ... p) {
        parts.addAll(Arrays.asList(p));
    }

    @Override
    public ArrayList<BodyPart> getParts() {
        return parts;
    }

    public static ArrayList<Animal> getAnimals(){
        return animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return l == animal.l && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l, name);
    }

    @Override
    public String toString() {
        return name + " находиться в " + l.name();
    }


}
