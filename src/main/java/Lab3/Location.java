public enum Location{
    WINNIES_HOUSE("Дом Винни-Пуха", LocationType.INDOOR),
    PIGLETS_HOUSE("Дом Пятачка", LocationType.INDOOR),
    FOREST("Лес", LocationType.OUTDOOR);

    private String name;
    private LocationType type;

    Location(String name, LocationType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public LocationType getType() {
        return type;
    }
}
