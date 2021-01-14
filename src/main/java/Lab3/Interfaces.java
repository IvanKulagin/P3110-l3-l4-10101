import java.util.ArrayList;

interface Move {
    void setLocation(Location l);

    Location getLocation();
}

interface Time {
    void add(int m);
}

interface UseBuffet {
    void checkBuffet(Buffet b);
}

interface BodyParts {
    void addParts(BodyPart ... p);

    ArrayList<BodyPart> getParts();
}

interface SnowFlakes {
    void addFlake(SnowFlake f);
}