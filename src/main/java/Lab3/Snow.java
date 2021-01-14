import java.util.ArrayList;
import java.util.Random;

public class Snow {
    private static ArrayList<BodyPart> parts;

    public static void createSnow(int n, Animal ... animals) {
        if (!Wind.isWindy()) {
            parts = new ArrayList<>();
            Random rnd = new Random();
            for (Animal animal : animals) {
                if (animal.getLocation() == Location.OUTDOOR) {
                    parts.addAll(animal.getParts());
                }
            }
            for (int i = 0; i < n; i++) {
                parts.get(rnd.nextInt(parts.size())).addFlake(new SnowFlake());
            }
        }
    }

    public static void getSnow(Animal ... animals){
        parts = new ArrayList<>();
        for (Animal animal : animals) {
            for (BodyPart part : animal.getParts()){
                System.out.println("У " + animal.getName() + " " + part.toString());
            }
        }
    }

    public static void getStatus() {
        if (Wind.isWindy()){
            System.out.println("Снег вертится, пытаясь поймать себя за хвост");
        }
        else System.out.println("Снег тихонько спускается вниз");
    }
}
