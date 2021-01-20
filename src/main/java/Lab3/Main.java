import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bear Winnie = new Bear("Винни-Пух", Location.FOREST);
        Winnie.addParts(new Nose());
        Piglet Piglet = new Piglet("Пятачок", Location.WINNIES_HOUSE);
        Piglet.addParts(new Neck(), new Ears());
        Winnie.knock(Location.PIGLETS_HOUSE);
        Song noisySong = new Song();
        Winnie.jump(noisySong);
        Winnie.sing(noisySong);
        try {
            Winnie.setLocation(Location.WINNIES_HOUSE);
        } catch (MoveToIndoorException e) {
            System.out.println(e.getMessage());
        }
        Armchair armchair = new Armchair(Location.WINNIES_HOUSE);
        Piglet.sit(armchair);
        Winnie.see();
        Clock clock = new Clock(10, 25);
        Winnie.checkTime(clock);
        Buffet buffet = new Buffet(Location.WINNIES_HOUSE);
        Winnie.checkBuffet(buffet);
        Weather weather = Weather.getInstanceOfWeather();
        Weather.Wind wind = Weather.Wind.getInstanceOfWind();
        wind.setWind(true);
        weather.getSnow();
        clock.add(30);
        try {
            Winnie.setLocation(Location.FOREST);
        } catch (MoveToIndoorException e) {
            System.out.println(e.getMessage());
        }
        try {
            Piglet.setLocation(Location.FOREST);
        } catch (MoveToIndoorException e) {
            System.out.println(e.getMessage());
        }
        clock.getTime();
        wind.setWind(false);
        weather.getSnow();
        weather.createSnow(1000, Winnie, Piglet);
        weather.getSnowness(Winnie, Piglet);
    }
}
