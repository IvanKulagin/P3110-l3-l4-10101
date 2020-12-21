import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Bear Winnie = new Bear("Винни", Location.HOUSE);
        Winnie.addParts(new Nose());
        animals.add(Winnie);
        Piglet Piglet = new Piglet("Пятачок", Location.HOUSE);
        Piglet.addParts(new Neck(), new Ears());
        animals.add(Piglet);
        Wind.setWind(true);
        Snow.getStatus();
        Clock clock = new Clock(10, 25);
        Buffet buffet = new Buffet(Location.HOUSE);
        Winnie.checkBuffet(buffet);
        clock.add(30);
        Winnie.setLocation(Location.OUTDOOR);
        Piglet.setLocation(Location.OUTDOOR);
        System.out.println(clock.toString());
        Wind.setWind(false);
        Snow.getStatus();
        Snow.createSnow(1000, animals);
        for (Animal animal : animals){
            for (BodyPart part : animal.getParts()){
                System.out.println("У " + animal.getName() + " " + part.toString());
            }
        }
    }
}
