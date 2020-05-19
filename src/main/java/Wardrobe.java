public class Wardrobe {

    private int remainingWidth;


    public Wardrobe(int remainingWidth) {
        this.remainingWidth = remainingWidth;
    }


    public void addComponent(Component size) {
        remainingWidth -= size.getWidth();
    }


    public int getRemainingWidth() {
        return remainingWidth;
    }
}
