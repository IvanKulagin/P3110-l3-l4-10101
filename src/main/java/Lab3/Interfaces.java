import java.util.ArrayList;

interface Move {
    void setLocation(Location location) throws MoveToIndoorException;

    Location getLocation();
}

interface Time {
    void add(int m);

    String getTime();
}

interface UseBuffet {
    void checkBuffet(Buffet buffet);
}

interface UseArmchair{
    void sit(Armchair armchair);
}

interface BodyParts {
    void addParts(BodyPart... part);

    ArrayList<BodyPart> getParts();
}

interface SnowFlakes {
    void addFlake(SnowFlake flake);
}

interface Snowy {
    void createSnow(int n, Animal... animals);

    void getSnowness(Animal... animals);

    void getSnow();
}

interface Windy {
    void setWind(boolean isWindy);

    boolean getWind();
}

interface Door {
    void knock(Location location);
}

interface Sing {
    void sing(Song song);
}

interface Text {
    void addText(String text);

    String getText();
}

interface UseClock {
    void checkTime(Clock clock);
}