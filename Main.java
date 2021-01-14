import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bear Winnie = new Bear("Винни-Пух", Location.HOUSE);
        Winnie.addParts(new Nose());
        Piglet Piglet = new Piglet("Пятачок", Location.HOUSE);
        Piglet.addParts(new Neck(), new Ears());
        Clock clock = new Clock(10, 25);
        Buffet buffet = new Buffet(Location.HOUSE);

        Wind.setWind(true);
        Snow.getStatus();
        System.out.println(clock.toString());
        Winnie.checkBuffet(buffet);
        clock.add(30);

        Winnie.setLocation(Location.OUTDOOR);
        Piglet.setLocation(Location.OUTDOOR);
        System.out.println(clock.toString());
        Wind.setWind(false);
        Snow.getStatus();
        Snow.createSnow(1000, Winnie, Piglet);
        Snow.getSnow(Winnie,Piglet);
    }
}
