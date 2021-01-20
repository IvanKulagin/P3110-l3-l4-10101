public class Bear extends Animal implements UseBuffet, UseClock, Door, Sing {
    Bear(String name, Location l) {
        super(name, l);
        System.out.println("Создан медведь " + name + " в локации " + l.getName());
    }

    @Override
    public void checkBuffet(Buffet buffet) {
        if (getLocation() == buffet.getLocation()) {
            System.out.println(getName() + " открыл буфет");
        }
    }

    @Override
    public void knock(Location l) {
        if (getLocation().getType() == LocationType.OUTDOOR && l.getType() == LocationType.INDOOR) {
            System.out.println(getName() + " постучался в " + l.getName());
        }
    }


    @Override
    public void sing(Song song) {
        System.out.println(getName() + " пропел:\n" + song.getText());
    }

    @Override
    public void checkTime(Clock clock) {
        System.out.println(getName() + " посмотрел на часы, которые показывали " + clock.toString());
    }

    public void jump(Song song) {
        System.out.println(getName() + " попрыгал и у него в голове зазвучал шум");
        song.addText("Иду вперёд\n" +
                "(Тирлим-бом-бом),\n" +
                "И снег идёт\n" +
                "(Тирлим-бом-бом),\n" +
                "Хоть нам совсем -\n" +
                "Совсем не по дороге!\n" +
                "Но только вот\n" +
                "(Тирлим-бом-бом)\n" +
                "Скажите, от -\n" +
                "(Тирлим-бом-бом),\n" +
                "Скажите, от -\n" +
                "Чего так зябнут ноги?");
    }

    public void see(){
        System.out.print(getName() + " увидел ");
        for(Animal animal : Animal.getAnimals()){
            if(animal.getLocation() == getLocation() && animal.getName() != getName()){
                System.out.print(animal.getName());
            }
        }
        System.out.println(" в " + getLocation().getName());
    }
}
