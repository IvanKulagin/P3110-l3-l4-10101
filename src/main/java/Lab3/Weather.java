import java.util.ArrayList;
import java.util.Random;

public class Weather implements Snowy{
    private static Weather instanceOfWeather;
    private static Wind instanceOfWind;
    private ArrayList<BodyPart> parts;

    private Weather(){

    }

    public static Weather getInstanceOfWeather() {
        if (instanceOfWeather == null){
            instanceOfWeather = new Weather();
            instanceOfWind = new Wind();
        }
        return instanceOfWeather;
    }

    @Override
    public void createSnow(int n, Animal ... animals){
        if (!instanceOfWind.getWind()) {
            parts = new ArrayList<>();
            Random rnd = new Random();
            for (Animal animal : animals) {
                if (animal.getLocation().getType() == LocationType.OUTDOOR) {
                    parts.addAll(animal.getParts());
                }
            }
            for (int i = 0; i < n; i++) {
                parts.get(rnd.nextInt(parts.size())).addFlake(new SnowFlake());
            }
        }
    }

    @Override
    public void getSnowness(Animal ... animals){
        parts = new ArrayList<>();
        for (Animal animal : animals) {
            for (BodyPart part : animal.getParts()){
                System.out.println("У " + animal.getName() + " " + part.toString());
            }
        }
    }

    @Override
    public void getSnow() {
        if (instanceOfWind.getWind()){
            System.out.println("Снег вертится, пытаясь поймать себя за хвост");
        }
        else System.out.println("Снег тихонько спускается вниз");
    }

    static class Wind implements Windy{
        private static Wind instance;
        private static boolean wind;

        private Wind() {

        }

        public static Wind getInstance(boolean isWindy){
            return instanceOfWind;
        }
        public static Wind getInstanceOfWind(){
            if (instance == null){
                instance = new Wind();
            }
            return instance;
        }
        public void setWind(boolean isWindy) {
            if (isWindy) {
                System.out.println("Ветер поднялся");
            } else System.out.println("Ветер стих");
            wind = isWindy;
        }

        public boolean getWind() {
            return wind;
        }
    }
}
