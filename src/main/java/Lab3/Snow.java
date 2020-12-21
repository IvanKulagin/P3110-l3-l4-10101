import java.util.ArrayList;
import java.util.Random;

public class Snow {
    public static void createSnow(int n, ArrayList<Animal> animals) {
        if (!Wind.isWindy()) {
            ArrayList<BodyPart> parts = new ArrayList<>();
            Random rnd = new Random();
            for (Animal animal : animals) {
                parts.addAll(animal.getParts());
            }
            for (int i = 0; i < n; i++) {
                parts.get(rnd.nextInt(parts.size())).addFlake(new SnowFlake());
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
