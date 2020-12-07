interface Move {
    void setLocation(Location l);

    Location getLocation();
}

interface Time {
    void add(int m);
}

interface Snow {
    void setSnowCover(boolean s);
    boolean getSnowCover();
}

interface Buffet {
    void checkBuffet();
}

interface Weather {
    void setWindActivity(boolean active);

    boolean isSnowFalling();
}
