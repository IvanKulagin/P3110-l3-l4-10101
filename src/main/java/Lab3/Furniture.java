abstract public class Furniture {
    private Location l;
    Furniture(Location l) throws FurnitureNotIndoorException{
        if (l.getType() == LocationType.INDOOR) {
            this.l = l;
        }
        else {
            throw new FurnitureNotIndoorException("Локация " + l.getName() + " не является домом, мебель не может быть создана");
        }
    }

    public Location getLocation(){
        return l;
    }
}
