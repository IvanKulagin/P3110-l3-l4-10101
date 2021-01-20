public class Song implements Text {
    private String text;

    @Override
    public void addText(String text){
        this.text = text;
    }

    @Override
    public String getText(){
        return text;
    }
}
