import java.util.ArrayList;
import java.util.Objects;

abstract public class BodyPart implements SnowFlakes{
    private ArrayList<SnowFlake> snowFlakes;
    private String name;

    BodyPart(String name) {
        this.name = name;
        snowFlakes = new ArrayList<>();
    }

    @Override
    public void addFlake(SnowFlake f) {
        snowFlakes.add(f);
    }

    @Override
    public ArrayList<SnowFlake> getFlakes() {
        return snowFlakes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyPart part = (BodyPart) o;
        return Objects.equals(snowFlakes, part.snowFlakes) &&
                Objects.equals(name, part.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snowFlakes, name);
    }

    @Override
    public String toString() {
        return name + " имеет " + snowFlakes.size() + " хлопьев снега";
    }
}
