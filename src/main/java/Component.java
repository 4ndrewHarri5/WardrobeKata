public enum Component {
    FIFTY(50),
    ONE_HUNDRED(100);

    private int width;

    Component(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
