import java.util.Objects;

abstract class Animal implements Move, Snow {
    private Location l;
    private String name;
    private boolean isInSnow;

    Animal(String name, Location l) {
        this.name = name;
        this.l = l;
    }

    String getName() {
        return name;
    }

    @Override
    public void setLocation(Location l) {
        this.l = l;
        System.out.println(name + " перемещён в локацию " + l.getName());
    }

    @Override
    public Location getLocation() {
        return l;
    }

    @Override
    public void setSnowCover(boolean isInSnow) {
        if (l.isSnowFalling() == true) {
            this.isInSnow = isInSnow;
            if (isInSnow) {
                System.out.println(name + " теперь весь в снегу");
            }
        }
    }

    @Override
    public boolean getSnowCover() {
        return isInSnow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isInSnow == animal.isInSnow && l == animal.l && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l, name, isInSnow);
    }

    @Override
    public String toString() {
        String s = name;
        if (isInSnow){
            s += " в снегу и ";
        }
        s += " находиться в " + l.name();
        return s;
    }
}
