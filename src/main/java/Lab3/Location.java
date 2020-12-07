public enum Location implements Weather {
    HOUSE("Дом", false, false),
    OUTDOOR("Улица", true, true);

    private boolean isWindy, isSnowy;
    private String name;

    Location(String name, boolean isWindy, boolean isSnowy) {
        this.name = name;
        this.isWindy = isWindy;
        this.isSnowy = isSnowy;
        System.out.print("В локации " + name);
        if (isWindy) {
            System.out.print(" поднялся ветер");
        }
        if (isSnowy) {
            if (isWindy) {
                System.out.print(" и");
            }
            System.out.println(" пошёл снег");
        } else {
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void setWindActivity(boolean isWindy) {
        this.isWindy = isWindy;
        System.out.print("В локации " + name);
        if (isWindy) {
            System.out.println(" поднялся ветер");
        } else {
            System.out.println(" стих ветер");
        }
    }

    @Override
    public boolean isSnowFalling() {
        return this.isSnowy && !this.isWindy;
    }
}
