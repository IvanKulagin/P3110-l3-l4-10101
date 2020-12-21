abstract public class Wind {
    private static boolean wind;

    public static void setWind(boolean isWindy) {
        if (isWindy) {
            System.out.println("Ветер поднялся");
        } else System.out.println("Ветер стих");
        wind = isWindy;
    }

    public static boolean isWindy() {
        return wind;
    }
}
