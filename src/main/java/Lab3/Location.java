public enum Location{
    HOUSE("Дом"),
    OUTDOOR("Улица");

    private String name;

    Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
