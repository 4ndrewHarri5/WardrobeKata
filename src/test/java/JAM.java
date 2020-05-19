import org.junit.Assert;
import org.junit.Test;

public class JAM {

    @Test
    public void JAMTest() {
        // Wardrobe takes one component and takes away size from max size or wardrobe left

        Wardrobe wardrobe = new Wardrobe(250);

        wardrobe.addComponent(Component.FIFTY);

        Assert.assertEquals(200, wardrobe.getRemainingWidth());

    }

    @Test
    public void canAddWardrobeComponents() {
        Wardrobe wardrobe = new Wardrobe(250);

        wardrobe.addComponent(Component.FIFTY);
        wardrobe.addComponent(Component.ONE_HUNDRED);

    }
}
