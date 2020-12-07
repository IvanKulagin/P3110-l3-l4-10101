public class Main {
    public static void main(String[] args) {
        Bear Winnie = new Bear("Винни", Location.HOUSE);
        Piglet Piglet = new Piglet("Пятачок", Location.HOUSE);
        Clock clock = new Clock(10, 25);
        Winnie.checkBuffet();
        clock.add(30);
        Winnie.setLocation(Location.OUTDOOR);
        Piglet.setLocation(Location.OUTDOOR);
        System.out.println(clock.toString());
        Location.OUTDOOR.setWindActivity(false);
        Winnie.setSnowCover(true);
        Piglet.setSnowCover(true);
    }
}
